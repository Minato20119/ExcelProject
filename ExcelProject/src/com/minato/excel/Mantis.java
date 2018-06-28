/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minato.excel;

/**
 *
 * @author Minato
 */
public class Mantis {

    private String none;
    private String reporter;
    private String p;
    private String id;
    private String severity;
    private String attachmentCount;
    private String category;
    private String summary;
    private String asignedTo;
    private String targetVersion;
    private String fixedInVersion;
    private String includeInReleaseNote;
    private String updated;
    private String customers;

    public Mantis() {
    }

    public Mantis(String none, String reporter, String p, String id, String severity, String attachmentCount, String category, String summary, String asignedTo, String targetVersion, String fixedInVersion, String includeInReleaseNote, String updated, String customers) {
        this.none = none;
        this.reporter = reporter;
        this.p = p;
        this.id = id;
        this.severity = severity;
        this.attachmentCount = attachmentCount;
        this.category = category;
        this.summary = summary;
        this.asignedTo = asignedTo;
        this.targetVersion = targetVersion;
        this.fixedInVersion = fixedInVersion;
        this.includeInReleaseNote = includeInReleaseNote;
        this.updated = updated;
        this.customers = customers;
    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(String attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAsignedTo() {
        return asignedTo;
    }

    public void setAsignedTo(String asignedTo) {
        this.asignedTo = asignedTo;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public String getFixedInVersion() {
        return fixedInVersion;
    }

    public void setFixedInVersion(String fixedInVersion) {
        this.fixedInVersion = fixedInVersion;
    }

    public String getIncludeInReleaseNote() {
        return includeInReleaseNote;
    }

    public void setIncludeInReleaseNote(String includeInReleaseNote) {
        this.includeInReleaseNote = includeInReleaseNote;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

}
