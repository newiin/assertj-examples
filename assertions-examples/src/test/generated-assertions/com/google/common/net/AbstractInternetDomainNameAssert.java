package com.google.common.net;

import org.assertj.core.api.AbstractAssert;

/**
 * Abstract base class for {@link InternetDomainName} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractInternetDomainNameAssert<S extends AbstractInternetDomainNameAssert<S, A>, A extends InternetDomainName> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractInternetDomainNameAssert}</code> to make assertions on actual InternetDomainName.
   * @param actual the InternetDomainName we want to make assertions on.
   */
  protected AbstractInternetDomainNameAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual InternetDomainName is publicSuffix.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is not publicSuffix.
   */
  public S isPublicSuffix() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isPublicSuffix()) {
      failWithMessage("\nExpected actual InternetDomainName to be publicSuffix but was not.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual InternetDomainName is not publicSuffix.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is publicSuffix.
   */
  public S isNotPublicSuffix() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isPublicSuffix()) {
      failWithMessage("\nExpected actual InternetDomainName not to be publicSuffix but was.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual InternetDomainName is topPrivateDomain.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is not topPrivateDomain.
   */
  public S isTopPrivateDomain() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isTopPrivateDomain()) {
      failWithMessage("\nExpected actual InternetDomainName to be topPrivateDomain but was not.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual InternetDomainName is not topPrivateDomain.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is topPrivateDomain.
   */
  public S isNotTopPrivateDomain() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isTopPrivateDomain()) {
      failWithMessage("\nExpected actual InternetDomainName not to be topPrivateDomain but was.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual InternetDomainName is underPublicSuffix.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is not underPublicSuffix.
   */
  public S isUnderPublicSuffix() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isUnderPublicSuffix()) {
      failWithMessage("\nExpected actual InternetDomainName to be underPublicSuffix but was not.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual InternetDomainName is not underPublicSuffix.
   * @return this assertion object.
   * @throws AssertionError - if the actual InternetDomainName is underPublicSuffix.
   */
  public S isNotUnderPublicSuffix() {
    // check that actual InternetDomainName we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isUnderPublicSuffix()) {
      failWithMessage("\nExpected actual InternetDomainName not to be underPublicSuffix but was.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

}
