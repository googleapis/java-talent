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
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public final class FiltersProto {
  private FiltersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ProfileQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobTitleFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SkillFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_EducationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_TimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/talent/v4beta1/filters.pr"
          + "oto\022\033google.cloud.talent.v4beta1\032\034google"
          + "/api/annotations.proto\032\037google/api/field"
          + "_behavior.proto\032(google/cloud/talent/v4b"
          + "eta1/common.proto\032\036google/protobuf/durat"
          + "ion.proto\032 google/protobuf/field_mask.pr"
          + "oto\032\037google/protobuf/timestamp.proto\032\036go"
          + "ogle/protobuf/wrappers.proto\032\026google/typ"
          + "e/date.proto\032\030google/type/latlng.proto\032\033"
          + "google/type/timeofday.proto\"\200\005\n\010JobQuery"
          + "\022\r\n\005query\030\001 \001(\t\022\033\n\023query_language_code\030\016"
          + " \001(\t\022\021\n\tcompanies\030\002 \003(\t\022E\n\020location_filt"
          + "ers\030\003 \003(\0132+.google.cloud.talent.v4beta1."
          + "LocationFilter\022@\n\016job_categories\030\004 \003(\0162("
          + ".google.cloud.talent.v4beta1.JobCategory"
          + "\022B\n\016commute_filter\030\005 \001(\0132*.google.cloud."
          + "talent.v4beta1.CommuteFilter\022\035\n\025company_"
          + "display_names\030\006 \003(\t\022L\n\023compensation_filt"
          + "er\030\007 \001(\0132/.google.cloud.talent.v4beta1.C"
          + "ompensationFilter\022\037\n\027custom_attribute_fi"
          + "lter\030\010 \001(\t\022\033\n\023disable_spell_check\030\t \001(\010\022"
          + "E\n\020employment_types\030\n \003(\0162+.google.cloud"
          + ".talent.v4beta1.EmploymentType\022\026\n\016langua"
          + "ge_codes\030\013 \003(\t\022G\n\022publish_time_range\030\014 \001"
          + "(\0132+.google.cloud.talent.v4beta1.Timesta"
          + "mpRange\022\025\n\rexcluded_jobs\030\r \003(\t\"\365\010\n\014Profi"
          + "leQuery\022\r\n\005query\030\001 \001(\t\022E\n\020location_filte"
          + "rs\030\002 \003(\0132+.google.cloud.talent.v4beta1.L"
          + "ocationFilter\022F\n\021job_title_filters\030\003 \003(\013"
          + "2+.google.cloud.talent.v4beta1.JobTitleF"
          + "ilter\022E\n\020employer_filters\030\004 \003(\0132+.google"
          + ".cloud.talent.v4beta1.EmployerFilter\022G\n\021"
          + "education_filters\030\005 \003(\0132,.google.cloud.t"
          + "alent.v4beta1.EducationFilter\022?\n\rskill_f"
          + "ilters\030\006 \003(\0132(.google.cloud.talent.v4bet"
          + "a1.SkillFilter\022Q\n\026work_experience_filter"
          + "\030\007 \003(\01321.google.cloud.talent.v4beta1.Wor"
          + "kExperienceFilter\022=\n\014time_filters\030\010 \003(\0132"
          + "\'.google.cloud.talent.v4beta1.TimeFilter"
          + "\0222\n\016hirable_filter\030\t \001(\0132\032.google.protob"
          + "uf.BoolValue\022T\n\030application_date_filters"
          + "\030\n \003(\01322.google.cloud.talent.v4beta1.App"
          + "licationDateFilter\022e\n!application_outcom"
          + "e_notes_filters\030\013 \003(\0132:.google.cloud.tal"
          + "ent.v4beta1.ApplicationOutcomeNotesFilte"
          + "r\022R\n\027application_job_filters\030\r \003(\01321.goo"
          + "gle.cloud.talent.v4beta1.ApplicationJobF"
          + "ilter\022\037\n\027custom_attribute_filter\030\017 \001(\t\022c"
          + "\n\035candidate_availability_filter\030\020 \001(\01328."
          + "google.cloud.talent.v4beta1.CandidateAva"
          + "ilabilityFilterB\002\030\001\022M\n\024availability_filt"
          + "ers\030\022 \003(\0132/.google.cloud.talent.v4beta1."
          + "AvailabilityFilter\022J\n\023person_name_filter"
          + "s\030\021 \003(\0132-.google.cloud.talent.v4beta1.Pe"
          + "rsonNameFilter\"\337\002\n\016LocationFilter\022\017\n\007add"
          + "ress\030\001 \001(\t\022\023\n\013region_code\030\002 \001(\t\022$\n\007lat_l"
          + "ng\030\003 \001(\0132\023.google.type.LatLng\022\031\n\021distanc"
          + "e_in_miles\030\004 \001(\001\022a\n\026telecommute_preferen"
          + "ce\030\005 \001(\0162A.google.cloud.talent.v4beta1.L"
          + "ocationFilter.TelecommutePreference\022\017\n\007n"
          + "egated\030\006 \001(\010\"r\n\025TelecommutePreference\022&\n"
          + "\"TELECOMMUTE_PREFERENCE_UNSPECIFIED\020\000\022\030\n"
          + "\024TELECOMMUTE_EXCLUDED\020\001\022\027\n\023TELECOMMUTE_A"
          + "LLOWED\020\002\"\312\003\n\022CompensationFilter\022M\n\004type\030"
          + "\001 \001(\0162:.google.cloud.talent.v4beta1.Comp"
          + "ensationFilter.FilterTypeB\003\340A\002\022R\n\005units\030"
          + "\002 \003(\0162>.google.cloud.talent.v4beta1.Comp"
          + "ensationInfo.CompensationUnitB\003\340A\002\022N\n\005ra"
          + "nge\030\003 \001(\0132?.google.cloud.talent.v4beta1."
          + "CompensationInfo.CompensationRange\0228\n0in"
          + "clude_jobs_with_unspecified_compensation"
          + "_range\030\004 \001(\010\"\206\001\n\nFilterType\022\033\n\027FILTER_TY"
          + "PE_UNSPECIFIED\020\000\022\r\n\tUNIT_ONLY\020\001\022\023\n\017UNIT_"
          + "AND_AMOUNT\020\002\022\032\n\026ANNUALIZED_BASE_AMOUNT\020\003"
          + "\022\033\n\027ANNUALIZED_TOTAL_AMOUNT\020\004\"\313\003\n\rCommut"
          + "eFilter\022G\n\016commute_method\030\001 \001(\0162*.google"
          + ".cloud.talent.v4beta1.CommuteMethodB\003\340A\002"
          + "\0223\n\021start_coordinates\030\002 \001(\0132\023.google.typ"
          + "e.LatLngB\003\340A\002\0227\n\017travel_duration\030\003 \001(\0132\031"
          + ".google.protobuf.DurationB\003\340A\002\022!\n\031allow_"
          + "imprecise_addresses\030\004 \001(\010\022N\n\014road_traffi"
          + "c\030\005 \001(\01626.google.cloud.talent.v4beta1.Co"
          + "mmuteFilter.RoadTrafficH\000\0220\n\016departure_t"
          + "ime\030\006 \001(\0132\026.google.type.TimeOfDayH\000\"L\n\013R"
          + "oadTraffic\022\034\n\030ROAD_TRAFFIC_UNSPECIFIED\020\000"
          + "\022\020\n\014TRAFFIC_FREE\020\001\022\r\n\tBUSY_HOUR\020\002B\020\n\016tra"
          + "ffic_option\"9\n\016JobTitleFilter\022\026\n\tjob_tit"
          + "le\030\001 \001(\tB\003\340A\002\022\017\n\007negated\030\002 \001(\010\"2\n\013SkillF"
          + "ilter\022\022\n\005skill\030\001 \001(\tB\003\340A\002\022\017\n\007negated\030\002 \001"
          + "(\010\"\246\002\n\016EmployerFilter\022\025\n\010employer\030\001 \001(\tB"
          + "\003\340A\002\022L\n\004mode\030\002 \001(\0162>.google.cloud.talent"
          + ".v4beta1.EmployerFilter.EmployerFilterMo"
          + "de\022\017\n\007negated\030\003 \001(\010\"\235\001\n\022EmployerFilterMo"
          + "de\022$\n EMPLOYER_FILTER_MODE_UNSPECIFIED\020\000"
          + "\022\032\n\026ALL_EMPLOYMENT_RECORDS\020\001\022#\n\037CURRENT_"
          + "EMPLOYMENT_RECORDS_ONLY\020\002\022 \n\034PAST_EMPLOY"
          + "MENT_RECORDS_ONLY\020\003\"\210\001\n\017EducationFilter\022"
          + "\016\n\006school\030\001 \001(\t\022\026\n\016field_of_study\030\002 \001(\t\022"
          + "<\n\013degree_type\030\003 \001(\0162\'.google.cloud.tale"
          + "nt.v4beta1.DegreeType\022\017\n\007negated\030\006 \001(\010\"|"
          + "\n\024WorkExperienceFilter\0221\n\016min_experience"
          + "\030\001 \001(\0132\031.google.protobuf.Duration\0221\n\016max"
          + "_experience\030\002 \001(\0132\031.google.protobuf.Dura"
          + "tion\"c\n\025ApplicationDateFilter\022%\n\nstart_d"
          + "ate\030\001 \001(\0132\021.google.type.Date\022#\n\010end_date"
          + "\030\002 \001(\0132\021.google.type.Date\"L\n\035Application"
          + "OutcomeNotesFilter\022\032\n\routcome_notes\030\001 \001("
          + "\tB\003\340A\002\022\017\n\007negated\030\002 \001(\010\"V\n\024ApplicationJo"
          + "bFilter\022\032\n\022job_requisition_id\030\002 \001(\t\022\021\n\tj"
          + "ob_title\030\003 \001(\t\022\017\n\007negated\030\004 \001(\010\"\374\001\n\nTime"
          + "Filter\022.\n\nstart_time\030\001 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022E\n\ntime_field\030\003 \001(\016"
          + "21.google.cloud.talent.v4beta1.TimeFilte"
          + "r.TimeField\"I\n\tTimeField\022\032\n\026TIME_FIELD_U"
          + "NSPECIFIED\020\000\022\017\n\013CREATE_TIME\020\001\022\017\n\013UPDATE_"
          + "TIME\020\002\"2\n\033CandidateAvailabilityFilter\022\017\n"
          + "\007negated\030\001 \001(\010:\002\030\001\"\266\001\n\022AvailabilityFilte"
          + "r\022M\n\013signal_type\030\001 \001(\01623.google.cloud.ta"
          + "lent.v4beta1.AvailabilitySignalTypeB\003\340A\002"
          + "\022?\n\005range\030\002 \001(\0132+.google.cloud.talent.v4"
          + "beta1.TimestampRangeB\003\340A\002\022\020\n\010required\030\003 "
          + "\001(\010\",\n\020PersonNameFilter\022\030\n\013person_name\030\001"
          + " \001(\tB\003\340A\002Bz\n\037com.google.cloud.talent.v4b"
          + "eta1B\014FiltersProtoP\001ZAgoogle.golang.org/"
          + "genproto/googleapis/cloud/talent/v4beta1"
          + ";talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.TimeOfDayProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_JobQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "QueryLanguageCode",
              "Companies",
              "LocationFilters",
              "JobCategories",
              "CommuteFilter",
              "CompanyDisplayNames",
              "CompensationFilter",
              "CustomAttributeFilter",
              "DisableSpellCheck",
              "EmploymentTypes",
              "LanguageCodes",
              "PublishTimeRange",
              "ExcludedJobs",
            });
    internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ProfileQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ProfileQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "LocationFilters",
              "JobTitleFilters",
              "EmployerFilters",
              "EducationFilters",
              "SkillFilters",
              "WorkExperienceFilter",
              "TimeFilters",
              "HirableFilter",
              "ApplicationDateFilters",
              "ApplicationOutcomeNotesFilters",
              "ApplicationJobFilters",
              "CustomAttributeFilter",
              "CandidateAvailabilityFilter",
              "AvailabilityFilters",
              "PersonNameFilters",
            });
    internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_LocationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_LocationFilter_descriptor,
            new java.lang.String[] {
              "Address",
              "RegionCode",
              "LatLng",
              "DistanceInMiles",
              "TelecommutePreference",
              "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_CompensationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationFilter_descriptor,
            new java.lang.String[] {
              "Type", "Units", "Range", "IncludeJobsWithUnspecifiedCompensationRange",
            });
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_CommuteFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CommuteFilter_descriptor,
            new java.lang.String[] {
              "CommuteMethod",
              "StartCoordinates",
              "TravelDuration",
              "AllowImpreciseAddresses",
              "RoadTraffic",
              "DepartureTime",
              "TrafficOption",
            });
    internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_JobTitleFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobTitleFilter_descriptor,
            new java.lang.String[] {
              "JobTitle", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SkillFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SkillFilter_descriptor,
            new java.lang.String[] {
              "Skill", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor,
            new java.lang.String[] {
              "Employer", "Mode", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_EducationFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_EducationFilter_descriptor,
            new java.lang.String[] {
              "School", "FieldOfStudy", "DegreeType", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_WorkExperienceFilter_descriptor,
            new java.lang.String[] {
              "MinExperience", "MaxExperience",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationDateFilter_descriptor,
            new java.lang.String[] {
              "StartDate", "EndDate",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor,
            new java.lang.String[] {
              "OutcomeNotes", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor,
            new java.lang.String[] {
              "JobRequisitionId", "JobTitle", "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_talent_v4beta1_TimeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_TimeFilter_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "TimeField",
            });
    internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CandidateAvailabilityFilter_descriptor,
            new java.lang.String[] {
              "Negated",
            });
    internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_AvailabilityFilter_descriptor,
            new java.lang.String[] {
              "SignalType", "Range", "Required",
            });
    internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_talent_v4beta1_PersonNameFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_PersonNameFilter_descriptor,
            new java.lang.String[] {
              "PersonName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
