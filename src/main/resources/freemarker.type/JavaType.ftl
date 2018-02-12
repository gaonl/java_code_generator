package ${packageName!""};

${accessFlag} ${type!""} ${className!""} {
    <#list fields as field>
    ${field.accessFlag} ${field.accessFlag} ${field.accessFlag};
    </#list>

    public ${className!""}() {
    }


}
