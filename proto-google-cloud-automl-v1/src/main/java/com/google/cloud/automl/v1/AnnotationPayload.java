/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/annotation_payload.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Contains annotation information that is relevant to AutoML.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.AnnotationPayload}
 */
public final class AnnotationPayload extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.AnnotationPayload)
    AnnotationPayloadOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnnotationPayload.newBuilder() to construct.
  private AnnotationPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnnotationPayload() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnnotationPayload(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18:
            {
              com.google.cloud.automl.v1.TranslationAnnotation.Builder subBuilder = null;
              if (detailCase_ == 2) {
                subBuilder =
                    ((com.google.cloud.automl.v1.TranslationAnnotation) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(
                      com.google.cloud.automl.v1.TranslationAnnotation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.automl.v1.TranslationAnnotation) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 2;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.AnnotationPayloadOuterClass
        .internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.AnnotationPayloadOuterClass
        .internal_static_google_cloud_automl_v1_AnnotationPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.AnnotationPayload.class,
            com.google.cloud.automl.v1.AnnotationPayload.Builder.class);
  }

  private int detailCase_ = 0;
  private java.lang.Object detail_;

  public enum DetailCase implements com.google.protobuf.Internal.EnumLite {
    TRANSLATION(2),
    DETAIL_NOT_SET(0);
    private final int value;

    private DetailCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static DetailCase valueOf(int value) {
      return forNumber(value);
    }

    public static DetailCase forNumber(int value) {
      switch (value) {
        case 2:
          return TRANSLATION;
        case 0:
          return DETAIL_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DetailCase getDetailCase() {
    return DetailCase.forNumber(detailCase_);
  }

  public static final int TRANSLATION_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  public boolean hasTranslation() {
    return detailCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  public com.google.cloud.automl.v1.TranslationAnnotation getTranslation() {
    if (detailCase_ == 2) {
      return (com.google.cloud.automl.v1.TranslationAnnotation) detail_;
    }
    return com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Annotation details for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
   */
  public com.google.cloud.automl.v1.TranslationAnnotationOrBuilder getTranslationOrBuilder() {
    if (detailCase_ == 2) {
      return (com.google.cloud.automl.v1.TranslationAnnotation) detail_;
    }
    return com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (detailCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.automl.v1.TranslationAnnotation) detail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (detailCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.automl.v1.TranslationAnnotation) detail_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.automl.v1.AnnotationPayload)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.AnnotationPayload other =
        (com.google.cloud.automl.v1.AnnotationPayload) obj;

    if (!getDetailCase().equals(other.getDetailCase())) return false;
    switch (detailCase_) {
      case 2:
        if (!getTranslation().equals(other.getTranslation())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (detailCase_) {
      case 2:
        hash = (37 * hash) + TRANSLATION_FIELD_NUMBER;
        hash = (53 * hash) + getTranslation().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.AnnotationPayload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.automl.v1.AnnotationPayload prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Contains annotation information that is relevant to AutoML.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.AnnotationPayload}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.AnnotationPayload)
      com.google.cloud.automl.v1.AnnotationPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.AnnotationPayloadOuterClass
          .internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.AnnotationPayloadOuterClass
          .internal_static_google_cloud_automl_v1_AnnotationPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.AnnotationPayload.class,
              com.google.cloud.automl.v1.AnnotationPayload.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.AnnotationPayload.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      detailCase_ = 0;
      detail_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.AnnotationPayloadOuterClass
          .internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.AnnotationPayload getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.AnnotationPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.AnnotationPayload build() {
      com.google.cloud.automl.v1.AnnotationPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.AnnotationPayload buildPartial() {
      com.google.cloud.automl.v1.AnnotationPayload result =
          new com.google.cloud.automl.v1.AnnotationPayload(this);
      if (detailCase_ == 2) {
        if (translationBuilder_ == null) {
          result.detail_ = detail_;
        } else {
          result.detail_ = translationBuilder_.build();
        }
      }
      result.detailCase_ = detailCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1.AnnotationPayload) {
        return mergeFrom((com.google.cloud.automl.v1.AnnotationPayload) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.AnnotationPayload other) {
      if (other == com.google.cloud.automl.v1.AnnotationPayload.getDefaultInstance()) return this;
      switch (other.getDetailCase()) {
        case TRANSLATION:
          {
            mergeTranslation(other.getTranslation());
            break;
          }
        case DETAIL_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.automl.v1.AnnotationPayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.AnnotationPayload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int detailCase_ = 0;
    private java.lang.Object detail_;

    public DetailCase getDetailCase() {
      return DetailCase.forNumber(detailCase_);
    }

    public Builder clearDetail() {
      detailCase_ = 0;
      detail_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.TranslationAnnotation,
            com.google.cloud.automl.v1.TranslationAnnotation.Builder,
            com.google.cloud.automl.v1.TranslationAnnotationOrBuilder>
        translationBuilder_;
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public boolean hasTranslation() {
      return detailCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public com.google.cloud.automl.v1.TranslationAnnotation getTranslation() {
      if (translationBuilder_ == null) {
        if (detailCase_ == 2) {
          return (com.google.cloud.automl.v1.TranslationAnnotation) detail_;
        }
        return com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
      } else {
        if (detailCase_ == 2) {
          return translationBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public Builder setTranslation(com.google.cloud.automl.v1.TranslationAnnotation value) {
      if (translationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detail_ = value;
        onChanged();
      } else {
        translationBuilder_.setMessage(value);
      }
      detailCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public Builder setTranslation(
        com.google.cloud.automl.v1.TranslationAnnotation.Builder builderForValue) {
      if (translationBuilder_ == null) {
        detail_ = builderForValue.build();
        onChanged();
      } else {
        translationBuilder_.setMessage(builderForValue.build());
      }
      detailCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public Builder mergeTranslation(com.google.cloud.automl.v1.TranslationAnnotation value) {
      if (translationBuilder_ == null) {
        if (detailCase_ == 2
            && detail_ != com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance()) {
          detail_ =
              com.google.cloud.automl.v1.TranslationAnnotation.newBuilder(
                      (com.google.cloud.automl.v1.TranslationAnnotation) detail_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          detail_ = value;
        }
        onChanged();
      } else {
        if (detailCase_ == 2) {
          translationBuilder_.mergeFrom(value);
        }
        translationBuilder_.setMessage(value);
      }
      detailCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public Builder clearTranslation() {
      if (translationBuilder_ == null) {
        if (detailCase_ == 2) {
          detailCase_ = 0;
          detail_ = null;
          onChanged();
        }
      } else {
        if (detailCase_ == 2) {
          detailCase_ = 0;
          detail_ = null;
        }
        translationBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public com.google.cloud.automl.v1.TranslationAnnotation.Builder getTranslationBuilder() {
      return getTranslationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    public com.google.cloud.automl.v1.TranslationAnnotationOrBuilder getTranslationOrBuilder() {
      if ((detailCase_ == 2) && (translationBuilder_ != null)) {
        return translationBuilder_.getMessageOrBuilder();
      } else {
        if (detailCase_ == 2) {
          return (com.google.cloud.automl.v1.TranslationAnnotation) detail_;
        }
        return com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Annotation details for translation.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TranslationAnnotation translation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.TranslationAnnotation,
            com.google.cloud.automl.v1.TranslationAnnotation.Builder,
            com.google.cloud.automl.v1.TranslationAnnotationOrBuilder>
        getTranslationFieldBuilder() {
      if (translationBuilder_ == null) {
        if (!(detailCase_ == 2)) {
          detail_ = com.google.cloud.automl.v1.TranslationAnnotation.getDefaultInstance();
        }
        translationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.TranslationAnnotation,
                com.google.cloud.automl.v1.TranslationAnnotation.Builder,
                com.google.cloud.automl.v1.TranslationAnnotationOrBuilder>(
                (com.google.cloud.automl.v1.TranslationAnnotation) detail_,
                getParentForChildren(),
                isClean());
        detail_ = null;
      }
      detailCase_ = 2;
      onChanged();
      ;
      return translationBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.AnnotationPayload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.AnnotationPayload)
  private static final com.google.cloud.automl.v1.AnnotationPayload DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.AnnotationPayload();
  }

  public static com.google.cloud.automl.v1.AnnotationPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotationPayload> PARSER =
      new com.google.protobuf.AbstractParser<AnnotationPayload>() {
        @java.lang.Override
        public AnnotationPayload parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnnotationPayload(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnnotationPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotationPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.AnnotationPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}