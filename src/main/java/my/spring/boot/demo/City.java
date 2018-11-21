package my.spring.boot.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class City {
  @Id
  private Long id;
  private String city;
  private String cityAscii;
  private Double lat;
  private Double lng;
  private String country;
  private String iso2;
  private String iso3;
  private String adminName;
  private String capital;
  private Long population;
}
