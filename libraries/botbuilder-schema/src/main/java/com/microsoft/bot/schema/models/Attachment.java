/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An attachment within an activity.
 */
public class Attachment {
    /**
     * mimetype/Contenttype for the file.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * Content Url.
     */
    @JsonProperty(value = "contentUrl")
    private String contentUrl;

    /**
     * Embedded content.
     */
    @JsonProperty(value = "content")
    private Object content;

    /**
     * (OPTIONAL) The name of the attachment.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * (OPTIONAL) Thumbnail associated with attachment.
     */
    @JsonProperty(value = "thumbnailUrl")
    private String thumbnailUrl;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the Attachment object itself.
     */
    public Attachment withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentUrl value.
     *
     * @return the contentUrl value
     */
    public String contentUrl() {
        return this.contentUrl;
    }

    /**
     * Set the contentUrl value.
     *
     * @param contentUrl the contentUrl value to set
     * @return the Attachment object itself.
     */
    public Attachment withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the Attachment object itself.
     */
    public Attachment withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Attachment object itself.
     */
    public Attachment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the thumbnailUrl value.
     *
     * @return the thumbnailUrl value
     */
    public String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * Set the thumbnailUrl value.
     *
     * @param thumbnailUrl the thumbnailUrl value to set
     * @return the Attachment object itself.
     */
    public Attachment withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

}