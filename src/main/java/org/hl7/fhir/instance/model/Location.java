package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011-2013, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, May 22, 2013 17:49+1000 for FHIR v0.09

import java.util.*;

import java.math.*;
/**
 * Contact details and position information for a physical place that may be visited and where healthcare resources and participants may be found or contained, accomodated, or stored
 */
public class Location extends Resource {

    public class LocationPositionComponent extends Element {
        /**
         * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML
         */
        private Decimal longitude;

        /**
         * Lattitude. The value domain and the interpretation are the same as for the text of the lattitude element in KML
         */
        private Decimal latitude;

        /**
         * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML
         */
        private Decimal altitude;

        public Decimal getLongitude() { 
          return this.longitude;
        }

        public void setLongitude(Decimal value) { 
          this.longitude = value;
        }

        public BigDecimal getLongitudeSimple() { 
          return this.longitude == null ? null : this.longitude.getValue();
        }

        public void setLongitudeSimple(BigDecimal value) { 
            if (this.longitude == null)
              this.longitude = new Decimal();
            this.longitude.setValue(value);
        }

        public Decimal getLatitude() { 
          return this.latitude;
        }

        public void setLatitude(Decimal value) { 
          this.latitude = value;
        }

        public BigDecimal getLatitudeSimple() { 
          return this.latitude == null ? null : this.latitude.getValue();
        }

        public void setLatitudeSimple(BigDecimal value) { 
            if (this.latitude == null)
              this.latitude = new Decimal();
            this.latitude.setValue(value);
        }

        public Decimal getAltitude() { 
          return this.altitude;
        }

        public void setAltitude(Decimal value) { 
          this.altitude = value;
        }

        public BigDecimal getAltitudeSimple() { 
          return this.altitude == null ? null : this.altitude.getValue();
        }

        public void setAltitudeSimple(BigDecimal value) { 
          if (value == null)
            this.altitude = null;
          else {
            if (this.altitude == null)
              this.altitude = new Decimal();
            this.altitude.setValue(value);
          }
        }

  }

    /**
     * Name of the location which identifies it to its users
     */
    private String_ name;

    /**
     * Description of the Location, which helps in finding or referencing the place
     */
    private String_ description;

    /**
     * Classification of the location
     */
    private List<CodeableConcept> type = new ArrayList<CodeableConcept>();

    /**
     * The contact details of the main communication devices present at the location
     */
    private Contact telecom;

    /**
     * Physical location
     */
    private Address address;

    /**
     * The absolute geographic location of the Location, expressed in a KML compatible manner
     */
    private LocationPositionComponent position;

    /**
     * The organization that provides services at the location
     */
    private ResourceReference provider;

    /**
     * Whether the location is still used to provide services
     */
    private Boolean active;

    /**
     * Another Location which this Location is physically inside of
     */
    private ResourceReference partOf;

    public String_ getName() { 
      return this.name;
    }

    public void setName(String_ value) { 
      this.name = value;
    }

    public String getNameSimple() { 
      return this.name == null ? null : this.name.getValue();
    }

    public void setNameSimple(String value) { 
        if (this.name == null)
          this.name = new String_();
        this.name.setValue(value);
    }

    public String_ getDescription() { 
      return this.description;
    }

    public void setDescription(String_ value) { 
      this.description = value;
    }

    public String getDescriptionSimple() { 
      return this.description == null ? null : this.description.getValue();
    }

    public void setDescriptionSimple(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new String_();
        this.description.setValue(value);
      }
    }

    public List<CodeableConcept> getType() { 
      return this.type;
    }

    public Contact getTelecom() { 
      return this.telecom;
    }

    public void setTelecom(Contact value) { 
      this.telecom = value;
    }

    public Address getAddress() { 
      return this.address;
    }

    public void setAddress(Address value) { 
      this.address = value;
    }

    public LocationPositionComponent getPosition() { 
      return this.position;
    }

    public void setPosition(LocationPositionComponent value) { 
      this.position = value;
    }

    public ResourceReference getProvider() { 
      return this.provider;
    }

    public void setProvider(ResourceReference value) { 
      this.provider = value;
    }

    public Boolean getActive() { 
      return this.active;
    }

    public void setActive(Boolean value) { 
      this.active = value;
    }

    public boolean getActiveSimple() { 
      return this.active == null ? null : this.active.getValue();
    }

    public void setActiveSimple(boolean value) { 
      if (value == false)
        this.active = null;
      else {
        if (this.active == null)
          this.active = new Boolean();
        this.active.setValue(value);
      }
    }

    public ResourceReference getPartOf() { 
      return this.partOf;
    }

    public void setPartOf(ResourceReference value) { 
      this.partOf = value;
    }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Location;
   }


}

