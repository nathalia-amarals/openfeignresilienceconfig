package org.example.payload;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ObjectResponse {
    private int objectID;
    private boolean isHighlight;
    private String accessionNumber;
    private String accessionYear;
    private boolean isPublicDomain;
    private String primaryImage;
    private String primaryImageSmall;
    private List<String> additionalImages;
    private List<Constituent> constituents;
    private String department;
    private String objectName;
    private String title;
    private String culture;
    private String period;
    private String dynasty;
    private String reign;
    private String portfolio;
    private String artistRole;
    private String artistPrefix;
    private String artistDisplayName;
    private String artistDisplayBio;
    private String artistSuffix;
    private String artistAlphaSort;
    private String artistNationality;
    private String artistBeginDate;
    private String artistEndDate;
    private String artistGender;
    private String artistWikidata_URL;
    private String artistULAN_URL;
    private String objectDate;
    private int objectBeginDate;
    private int objectEndDate;
    private String medium;
    private String dimensions;
    private List<Measurement> measurements;
    private String creditLine;
    private String geographyType;
    private String city;
    private String state;
    private String county;
    private String country;
    private String region;
    private String subregion;
    private String locale;
    private String locus;
    private String excavation;
    private String river;
    private String classification;
    private String rightsAndReproduction;
    private String linkResource;
    private String metadataDate;
    private String repository;
    private String objectURL;
    private List<Tag> tags;
    private String objectWikidata_URL;
    private boolean isTimelineWork;
    private String GalleryNumber;

    @Data
    static class Constituent {
        private int constituentID;
        private String role;
        private String name;
        private String constituentULAN_URL;
        private String constituentWikidata_URL;
        private String gender;

        // Getters e Setters
    }

    @Data
    static class Measurement {
        private String elementName;
        private String elementDescription;
        private ElementMeasurements elementMeasurements;

        // Getters e Setters
    }

    @Data
    static class ElementMeasurements {
        private double Height;
        private double Width;

        // Getters e Setters
    }

    @Data
    static class Tag {
        private String term;
        private String AAT_URL;
        private String Wikidata_URL;

        // Getters e Setters
    }
}


