package com.eviware.soapui.impl.rest.mock;

import com.eviware.soapui.config.RESTMockServiceConfig;
import com.eviware.soapui.impl.support.AbstractMockService;
import com.eviware.soapui.impl.wsdl.mock.WsdlMockRunContext;
import com.eviware.soapui.model.mock.MockDispatcher;
import com.eviware.soapui.model.mock.MockRunner;
import com.eviware.soapui.model.project.Project;

public class RestMockService extends AbstractMockService<RestMockAction, RESTMockServiceConfig>
{
	public RestMockService( Project project, RESTMockServiceConfig config )
	{
		super( config, project );

        if( !getConfig().isSetProperties() )
            getConfig().addNewProperties();

        setPropertiesConfig(config.getProperties());

    }

	@Override
	public MockRunner start() throws Exception
	{
		return null;
	}

	@Override
	public MockDispatcher createDispatcher( WsdlMockRunContext mockContext )
	{
		return null;
	}
}
