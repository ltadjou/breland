package org.server.localshop.documentmanagment;

import java.util.Set;

public class DocumentCommand {

    private final Long id;
    private final String parentEntityType;
    private final Long parentEntityId;
    private final String name;
    private final String description;

    private String fileName;
    private Long size;
    private String type;
    private String location;
    private Integer storageType;

    private final Set<String> modifiedParameters;

    public DocumentCommand(final Set<String> modifiedParameters, final Long id, final String parentEntityType, final Long parentEntityId,
            final String name, final String fileName, final Long size, final String type, final String description, final String location) {
        this.modifiedParameters = modifiedParameters;
        this.id = id;
        this.parentEntityType = parentEntityType;
        this.parentEntityId = parentEntityId;
        this.name = name;
        this.fileName = fileName;
        this.size = size;
        this.type = type;
        this.description = description;
        this.location = location;
    }

    public Long getId() {
        return this.id;
    }

    public String getParentEntityType() {
        return this.parentEntityType;
    }

    public Long getParentEntityId() {
        return this.parentEntityId;
    }

    public String getName() {
        return this.name;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLocation() {
        return this.location;
    }

    public Set<String> getModifiedParameters() {
        return this.modifiedParameters;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setSize(final Long size) {
        this.size = size;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public Integer getStorageType() {
        return this.storageType;
    }

    public void setStorageType(final Integer storageType) {
        this.storageType = storageType;
    }

    public boolean isNameChanged() {
        return this.modifiedParameters.contains("name");
    }

    public boolean isFileNameChanged() {
        return this.modifiedParameters.contains("fileName");
    }

    public boolean isSizeChanged() {
        return this.modifiedParameters.contains("size");
    }

    public boolean isFileTypeChanged() {
        return this.modifiedParameters.contains("type");
    }

    public boolean isDescriptionChanged() {
        return this.modifiedParameters.contains("description");
    }

    public boolean isLocationChanged() {
        return this.modifiedParameters.contains("location");
    }

}