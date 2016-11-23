/*
 * Copyright 2013 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.impl.saml;


import com.stormpath.sdk.impl.query.DefaultCriteria;
import com.stormpath.sdk.saml.SamlServiceProviderRegistrationCriteria;
import com.stormpath.sdk.saml.SamlServiceProviderRegistrationOptions;

/**
 * @since 1.2.1
 */
public class DefaultSamlServiceProviderRegistrationCriteria extends DefaultCriteria<SamlServiceProviderRegistrationCriteria, SamlServiceProviderRegistrationOptions> implements SamlServiceProviderRegistrationCriteria {

    public DefaultSamlServiceProviderRegistrationCriteria() {
        super(new DefaultSamlServiceProviderRegistrationOptions());
    }

    @Override
    public SamlServiceProviderRegistrationCriteria withServiceProvider() {
        getOptions().withServiceProvider();
        return this;
    }

    @Override
    public SamlServiceProviderRegistrationCriteria withIdentityProvider() {
        getOptions().withIdentityProvider();
        return this;
    }

    @Override
    public SamlServiceProviderRegistrationCriteria orderByStatus() {
        return orderBy(DefaultSamlServiceProviderRegistration.STATUS);
    }

    @Override
    public SamlServiceProviderRegistrationCriteria orderByDefaultRelayState() {
        return orderBy(DefaultSamlServiceProviderRegistration.DEFAULT_RELAY_STATE);
    }
}
