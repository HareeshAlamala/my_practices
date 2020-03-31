package com.practice;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        String sql = new StringBuilder("SELECT SP.NAME, ")
                .append("  NVL(SPV.VALUE,SP.DEFAULT_VALUE) AS VALUE ")
                .append("FROM ACS_CORE.SVC$SI_PROPERTY_VALUE SPV ")
                .append("RIGHT OUTER JOIN ACS_CORE.SVC$SI_PROPERTIES SP ")
                .append("ON SP.SI_PROPERTY_ID        =SPV.SI_PROPERTY_ID ")
                .append("AND SPV.SERVICE_INSTANCE_ID = ")
                .append("  (SELECT SERVICE_INSTANCE_ID ")
                .append("  FROM ACS_CORE.PCH$PATCHING_REQUESTS ")
                .append("  WHERE PATCHING_REQUEST_ID= ")
                .append("100128")
                .append("  ) ")
                .append("WHERE SP.SERVICE_ID IN ")
                .append("  (SELECT SERVICE_ID ")
                .append("  FROM ACS_CORE.SVC$SERVICE_INSTANCES ")
                .append("  WHERE SERVICE_INSTANCE_ID IN ")
                .append("    (SELECT SERVICE_INSTANCE_ID ")
                .append("    FROM ACS_CORE.PCH$PATCHING_REQUESTS ")
                .append("    WHERE PATCHING_REQUEST_ID= ")
                .append("100128")
                .append("    ) ")
                .append("  )").toString();
        System.out.println(sql);
    }





}
