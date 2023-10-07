package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.Getter;
import lombok.Setter;

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "get_cities_by_country", procedureName = "get_cities_by_country", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "city_count", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "acity_id", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "random_value", type = Double.class)
        },resultClasses = CitiesByCountry.class)
})
@Entity
@Getter
@Setter
public class CitiesByCountry {

    @Id
    private String cityId;
    private String cityName;
    private String countryId;
    private String countryName;
}
