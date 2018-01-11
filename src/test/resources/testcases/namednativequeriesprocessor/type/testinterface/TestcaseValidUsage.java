package io.toolisticon.byoct.jpa.namednativequeriesprocessor.testinterface;

import javax.persistence.NamedNativeQueries;

@NamedNativeQueries(value={@javax.persistence.NamedNativeQuery(name="STRING", query="STRING")})
public interface TestcaseValidUsage {

}