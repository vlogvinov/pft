package ru.stqa.pft.addressbook.model;

public class GroupData {
    private final String group_name;
    private final String group_header;
    private final String group_footer;

    public GroupData(String group_name, String group_header, String group_footer) {
        this.group_name = group_name;
        this.group_header = group_header;
        this.group_footer = group_footer;
    }

    public String getGroup_name() {
        return group_name;
    }

    public String getGroup_header() {
        return group_header;
    }

    public String getGroup_footer() {
        return group_footer;
    }
}
