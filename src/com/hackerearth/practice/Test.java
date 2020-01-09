package com.hackerearth.practice;

public class Test {

    public static void main(String[] args) {

         String PRM_RESOURCE_SCHEDULE_REPORT_PLATINUM_QUERY = "SELECT * FROM (SELECT   T3.PATCHING_EVENT_ID as \"patchEventId\" ,  case when (T3.SR_NUMBER = 'null') then null else T3.SR_NUMBER end as \"srNumber\",  T1.PROP_NAME,T1.PROP_VALUE, T3.GATEWAY AS \"gateway\", T3.PRODUCT AS \"product\",'NA' AS \"customer\",'NA' AS \"customerId\",'NA' AS \"patchCoordinator\" \n" +
                " FROM (SELECT PATCHING_EVENT_SEQ_ID, PROP_NAME, PROP_VALUE FROM ACS_SVC.PATCHING_EVENT_PROPERTIES WHERE PROP_NAME IN ('PATCHING_SCENARIO','RESOURCE_ASSIGNMENT_ID','CM_ID','RAC_NAME','RAC_SIZE') AND PATCHING_EVENT_SEQ_ID IN (SELECT PATCHING_EVENT_SEQ_ID FROM ACS_SVC.PATCHING_EVENT_PROPERTIES WHERE PROP_NAME = 'RESOURCE_ASSIGNMENT_ID'  AND PROP_VALUE IN (:requestId) ) ) T1 \n" +
                " INNER JOIN  (SELECT PE.PATCHING_EVENT_ID, PE.SR_NUMBER AS SR_NUMBER,  PE.PATCHING_EVENT_SEQ_ID, PE.SERVICE_INSTANCE_ID, NVL(OTV.GATEWAY_NAME,'NA') AS GATEWAY, NVL(MOTV.TARGET_MODEL,'NA') AS PRODUCT FROM ACS_SVC.PATCHING_EVENTS PE  INNER JOIN CMDB.OASP_TARGETS_VIEW OTV ON OTV.UUID = PE.CTA_UUID  INNER JOIN ACS_SVC.PATCHING_EVENT_TARGETS PET ON PE.PATCHING_EVENT_ID = PET.PATCHING_EVENT_ID \n" +
                " INNER JOIN CMDB.OASP_TARGETS_VIEW MOTV ON PET.TARGET_GUID = MOTV.TARGET_GUID ) T3 ON T1.PATCHING_EVENT_SEQ_ID = T3.PATCHING_EVENT_SEQ_ID) PIVOT (MAX(PROP_VALUE) FOR PROP_NAME IN ( 'PATCHING_SCENARIO' AS \"patchType\", 'RESOURCE_ASSIGNMENT_ID' AS \"requestId\", 'CM_ID' AS \"cmTicket\", 'RAC_NAME' AS \"rackName\", 'RAC_SIZE' AS \"rackType\" ))";

         String PRM_RESOURCE_SCHEDULE_REPORT_OCC_QUERY = "WITH TEMPVIEW AS (SELECT * FROM  (SELECT PATCHING_REQUEST_UUID, PROP_NAME,PROP_VALUE FROM ACS_SVC.PATCH_REQ_PROPERTIES WHERE PATCHING_REQUEST_UUID IN (SELECT PATCHING_REQUEST_UUID FROM ACS_SVC.PATCH_REQ_PROPERTIES WHERE PROP_NAME = 'resourceId' AND PROP_VALUE IN (:requestId)  ) AND PROP_NAME IN ('serviceRequestId','resourceId','patchType','rackSize','serviceInstanceId','targetUUID','hardwareType','productName','customerName','cmTicketId') )PIVOT (MAX(PROP_VALUE) FOR PROP_NAME IN ('serviceRequestId' AS SR_NUMBER,'resourceId' AS REQUEST_ID,'patchType' AS PATCH_TYPE,'rackSize' AS RACK_SIZE,'serviceInstanceId' AS SI_ID,'targetUUID' AS T_UUID,'hardwareType' AS HW_TYPE,'productName' AS PRODUCT,'customerName' AS CUSTOMER_NAME,'cmTicketId' AS CM_ID) )  ) " +
                "SELECT  0 AS \"patchEventId\", CASE WHEN ( tempview.sr_number = 'null' ) THEN NULL ELSE tempview.sr_number END AS \"srNumber\", 'NA' AS \"gateway\",nvl(tempview.product, 'NA') AS \"product\",'NA' AS \"customer\",'NA' AS \"customerId\",'NA' AS \"patchCoordinator\",  nvl(tempview.patch_type, 'NA') AS \"patchType\", tempview.request_id AS \"requestId\", tempview.cm_id AS \"cmTicket\", 'NA' AS \"rackName\", nvl(tempview.rack_size, 'NA') AS \"rackType\" FROM  tempview ";

         String GET_DUPLICATE_PATCHING_EVENTS_QUERY = " SELECT PE2.PATCHING_EVENT_SEQ_ID,PE2.PATCHING_EVENT_ID,PE2.CTA_UUID FROM (SELECT CTA_UUID,SERVICE_INSTANCE_ID,PATCHING_EVENT_ID,COUNT(*) AS C FROM ACS_SVC.PATCHING_EVENTS " +
                " GROUP BY CTA_UUID, SERVICE_INSTANCE_ID,PATCHING_EVENT_ID HAVING COUNT(*) > 1 ) T1 INNER JOIN ACS_SVC.PATCHING_EVENTS PE ON T1.CTA_UUID = PE.CTA_UUID AND T1.SERVICE_INSTANCE_ID = PE.SERVICE_INSTANCE_ID  AND T1.PATCHING_EVENT_ID = PE.PATCHING_EVENT_ID \r\n" +
                " INNER JOIN ACS_SVC.PATCHING_EVENTS PE2 ON PE.PATCHING_EVENT_ID = PE2.PATCHING_EVENT_ID AND PE.SERVICE_INSTANCE_ID = PE2.SERVICE_INSTANCE_ID AND PE.CTA_UUID = PE2.CTA_UUID AND PE.LAST_REFRESH_DATE > PE2.LAST_REFRESH_DATE";
        String GET_DUPLICATE_PATCHING_EVENT_TARGETS_QUERY = "SELECT  PET2.PATCH_EVENT_TARGET_ID,PET2.PATCHING_EVENT_ID, PET2.CTA_UUID, PET2.SERVICE_INSTANCE_ID FROM \r\n" +
                " (SELECT TARGET_GUID,CTA_UUID,SERVICE_INSTANCE_ID, PATCHING_EVENT_ID,COUNT(*) AS COUNT FROM ACS_SVC.PATCHING_EVENT_TARGETS GROUP BY CTA_UUID,TARGET_GUID,SERVICE_INSTANCE_ID, PATCHING_EVENT_ID\r\n" +
                " HAVING COUNT(*) > 1 ) T1 INNER JOIN ACS_SVC.PATCHING_EVENT_TARGETS PET ON PET.TARGET_GUID = T1.TARGET_GUID AND PET.CTA_UUID = T1.CTA_UUID AND PET.SERVICE_INSTANCE_ID = T1.SERVICE_INSTANCE_ID\r\n" +
                " AND PET.PATCHING_EVENT_ID = T1.PATCHING_EVENT_ID INNER JOIN ACS_SVC.PATCHING_EVENT_TARGETS PET2 ON PET.TARGET_GUID = PET2.TARGET_GUID AND PET.CTA_UUID = PET2.CTA_UUID AND PET.SERVICE_INSTANCE_ID = PET2.SERVICE_INSTANCE_ID\r\n" +
                " AND PET.PATCHING_EVENT_ID = PET2.PATCHING_EVENT_ID AND PET.LAST_REFRESH_DATE > PET2.LAST_REFRESH_DATE ";

        String GET_DUPLICATE_PATCHING_TARGETS_QUERY = " SELECT PT2.PATCHING_TARGET_ID,PT2.TARGET_GUID, PT2.SERVICE_INSTANCE_ID  FROM \r\n" +
                " (SELECT TARGET_GUID,SERVICE_INSTANCE_ID, COUNT(*) AS C FROM ACS_SVC.PATCHING_TARGETS GROUP BY TARGET_GUID, SERVICE_INSTANCE_ID HAVING COUNT(*) > 1) T1\r\n" +
                " INNER JOIN ACS_SVC.PATCHING_TARGETS PT ON T1.TARGET_GUID = PT.TARGET_GUID AND T1.SERVICE_INSTANCE_ID = PT.SERVICE_INSTANCE_ID INNER JOIN ACS_SVC.PATCHING_TARGETS PT2 ON PT2.TARGET_GUID = PT.TARGET_GUID\r\n" +
                " AND PT2.SERVICE_INSTANCE_ID = PT.SERVICE_INSTANCE_ID AND PT2.LAST_REFRESH_DATE > PT.LAST_REFRESH_DATE";

        String sqlQuery="with verview as ( select pvv.target_type,pvv.patch_base_version,pvv.recversion "
                + "from acs_svc.patch_versions_view pvv JOIN cmdb.OASP_TARGETS_VIEW cmdb "
                + "ON cmdb.target_type = pvv.target_type GROUP BY pvv.target_type,pvv.patch_base_version,pvv.recversion)"
                + " SELECT DISTINCT pet.patching_event_id AS \"patchingEventId\", pt.current_patch AS \"currentVersion\","
                + " (CASE WHEN instr(verview.recversion, '.') = 0 THEN ( TO_CHAR(TO_DATE(verview.recversion,'YYMMDD'),"
                + "'MON YYYY') ) ELSE TO_CHAR(verview.recversion) END ) AS \"rVersion\","
                + " nvl( pt.compliance_status, 'NA' ) AS \"complianceStatus\", "
                + "CASE WHEN ( pe.scheduled_start_date IS NULL ) THEN 'NA'"
                + " ELSE ( TO_CHAR( pe.scheduled_start_date, 'YYYY-MM-DD HH24:MI' ) ) END AS \"scheduledStartDate\", "
                + "target.target_name AS \"targetName\", cta.gateway_name AS \"gatewayName\", pe.sr_number AS \"srNumber\", "
                + "upper(tmv.email1) AS \"pcName\", siv.party_name AS \"customerName\","
                + " siv.customer_service_name AS \"serviceName\",siv.PARTY_NUMBER AS \"customerId\", "
                + " cta.TARGET_CUSTOMER_ORG_ID as \"orgId\", org.country_name as \"country\", org.region_code as \"region\" FROM acs_svc.patching_events pe "
                + "JOIN acs_svc.patching_event_targets pet ON pe.service_instance_id = pet.service_instance_id AND"
                + " pe.patching_event_id = pet.patching_event_id AND pe.cta_uuid = pet.cta_uuid RIGHT JOIN acs_svc.patching_targets pt ON pt.current_patch IS NOT NULL AND"
                + " pt.target_guid = pet.target_guid AND pt.service_instance_id = pet.service_instance_id LEFT JOIN cmdb.OASP_TARGETS_VIEW cta ON pet.cta_uuid = cta.uuid JOIN "
                + "(SELECT SERVICE_INSTANCE_ID, LISTAGG(EMAIL1, ', ') WITHIN GROUP (ORDER BY EMAIL1) AS EMAIL1  FROM "
                + " (SELECT TMV1.EMAIL1 , TMV1.SERVICE_INSTANCE_ID FROM USER_MGMT.TEAM_MEMBERS_VIEW TMV1 WHERE UPPER(TMV1.ROLE_CODE) = 'PATCH COORDINATOR'  ) "
                + "  GROUP BY SERVICE_INSTANCE_ID) tmv ON "
                + " pt.service_instance_id = tmv.service_instance_id JOIN csf.service_instances_view siv "
                + "ON siv.service_instance_id = tmv.service_instance_id AND siv.service_instance_id = pt.service_instance_id "
                + "JOIN cmdb.OASP_TARGETS_VIEW target ON upper(target.cms_status) IN ( 'PRODUCTION','STAGING' ) AND"
                + " target.target_name IS NOT NULL AND pt.target_guid = target.target_guid JOIN verview ON"
                + " verview.patch_base_version = ( CASE WHEN (length(pt.current_patch) >= 8 ) THEN substr(pt.current_patch,0,8)"
                + " ELSE NULL END ) AND verview.target_type=target.target_type left join CSF.ORGANIZATIONS_VW org on cta.TARGET_CUSTOMER_ORG_ID = org.org_id ";

         String GET_PATCHING_TARGETS_EXADATA = " SELECT T2.gateway_guid,T2.gateway_name,T2.target_guid, T1.ASSOC_CI_SERIAL_NUMBER FROM CMDB.OASP_TARGET_ASSOCIATIONS_VIEW T1, CMDB.OASP_TARGETS_VIEW T2 WHERE T1.ASSOC_CI_SERIAL_NUMBER IN (:rackSerialNumber) AND T1.CI_TYPE='oracle_dbmachine' AND T1.assoc_ci_type = 'host' \n" +
                " and ci_association_type = 'app_composite_contains' AND T1.UUID = T2.UUID AND T2.target_type='oracle_dbmachine' ";

         String GET_PATCHING_TARGETS_ZDLRA = " SELECT T2.gateway_guid,T2.gateway_name,T2.target_guid, T1.ASSOC_CI_SERIAL_NUMBER FROM CMDB.OASP_TARGET_ASSOCIATIONS_VIEW T1, CMDB.OASP_TARGETS_VIEW T2 WHERE T1.ASSOC_CI_SERIAL_NUMBER IN (:zdlraRackSerialNumber) AND T1.CI_TYPE='oracle_dblra' AND T1.assoc_ci_type = 'host' \n" +
                " and ci_association_type = 'hosted_by' AND T1.UUID = T2.UUID AND T2.target_type='oracle_dblra' ";

        String sqlString = GET_PATCHING_TARGETS_ZDLRA;
        System.out.print(sqlString);
    }
}
