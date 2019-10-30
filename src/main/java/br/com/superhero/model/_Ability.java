// $LastChangedRevision: 4733 $ DO NOT EDIT.  Make changes to Ability.java instead.
package br.com.superhero.model;

import er.extensions.eof.*;
import er.extensions.foundation.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Ability extends  ERXGenericRecord {
	public static final String ENTITY_NAME = "Ability";

// Attribute Keys
  public static final ERXKey<String> DESCRIPTION = new ERXKey<String>("description");
  public static final ERXKey<br.com.superhero.model.Strength> STRENGTH = new ERXKey<br.com.superhero.model.Strength>("strength");
  // Relationship Keys

	// Attributes
	public static final String DESCRIPTION_KEY = "description";
	public static final String STRENGTH_KEY = "strength";

	// Relationships

  private static Logger logger = Logger.getLogger(_Ability.class);

  public Ability localInstanceIn(EOEditingContext editingContext) {
    Ability localInstance = (Ability)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String description() {
    return (String) storedValueForKey("description");
  }

  public void setDescription(String value) {
    if (_Ability.logger.isDebugEnabled()) {
    	_Ability.logger.debug( "updating description from " + description() + " to " + value);
    }
    takeStoredValueForKey(value, "description");
  }

  public br.com.superhero.model.Strength strength() {
    return (br.com.superhero.model.Strength) storedValueForKey("strength");
  }

  public void setStrength(br.com.superhero.model.Strength value) {
    if (_Ability.logger.isDebugEnabled()) {
    	_Ability.logger.debug( "updating strength from " + strength() + " to " + value);
    }
    takeStoredValueForKey(value, "strength");
  }


  public static Ability createAbility(EOEditingContext editingContext) {
    return (Ability) EOUtilities.createAndInsertInstance(editingContext, _Ability.ENTITY_NAME);  }

  public static Ability createAbility(EOEditingContext editingContext, String description
, br.com.superhero.model.Strength strength
) {
    Ability eo = (Ability) EOUtilities.createAndInsertInstance(editingContext, _Ability.ENTITY_NAME);
		eo.setDescription(description);
		eo.setStrength(strength);
    return eo;
  }

  public static NSArray<Ability> fetchAllAbilities(EOEditingContext editingContext) {
    return _Ability.fetchAllAbilities(editingContext, null);
  }

  public static NSArray<Ability> fetchAllAbilities(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Ability.fetchAbilities(editingContext, null, sortOrderings);
  }

  public static NSArray<Ability> fetchAbilities(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Ability.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Ability> eoObjects = (NSArray<Ability>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static NSArray<Ability> fetchAbilities(EOEditingContext editingContext, String keyName, Object value, NSArray<EOSortOrdering> sortOrderings) {
	return fetchAbilities(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value), sortOrderings);
  }

  public static NSArray<Ability> fetchAbilities(EOEditingContext editingContext, String keyName, Object value, String sortAscKey) {
	NSArray<EOSortOrdering> sortOrderings = new NSArray<EOSortOrdering>(EOSortOrdering.sortOrderingWithKey(sortAscKey, EOSortOrdering.CompareAscending));
	return fetchAbilities(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value), sortOrderings);
  }


  public static Ability fetchAbility(EOEditingContext editingContext, String keyName, Object value) {
    return _Ability.fetchAbility(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Ability fetchAbility(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Ability> eoObjects = _Ability.fetchAbilities(editingContext, qualifier, null);
    Ability eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Ability)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Ability that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Ability fetchRequiredAbility(EOEditingContext editingContext, String keyName, Object value) {
    return _Ability.fetchRequiredAbility(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Ability fetchRequiredAbility(EOEditingContext editingContext, EOQualifier qualifier) {
    Ability eoObject = _Ability.fetchAbility(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Ability that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Ability localInstanceIn(EOEditingContext editingContext, Ability eo) {
    Ability localInstance = (eo == null) ? null : (Ability)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }



}
