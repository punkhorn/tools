/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.properties;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.switchyard.tools.ui.explorer.impl.SwitchYardRootNode;

/**
 * ArtifactPropertySource
 * 
 * <p/>
 * Provides properties for IArtifactNode objects.
 * 
 * @author Rob Cernich
 */
public class SwitchYardRootPropertySource implements IPropertySource {

    private static final String PROP_MODEL = "model";
    private static final String PROP_RESOURCE = "resource";
    private static final PropertyDescriptor[] DESCRIPTORS;

    private SwitchYardRootNode _node;

    /* package */SwitchYardRootPropertySource(SwitchYardRootNode node) {
        _node = node;
    }

    @Override
    public Object getEditableValue() {
        return null;
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public Object getPropertyValue(Object id) {
        if (PROP_MODEL.equals(id)) {
            return _node.getModel();
        } else if (PROP_RESOURCE.equals(id)) {
            return _node.getSwitchYardProject().getSwitchYardConfigurationFile();
        }
        return "";
    }

    @Override
    public boolean isPropertySet(Object id) {
        return false;
    }

    @Override
    public void resetPropertyValue(Object id) {
    }

    @Override
    public void setPropertyValue(Object id, Object value) {
    }

    static {
        DESCRIPTORS = new PropertyDescriptor[] {new PropertyDescriptor(PROP_MODEL, "Application"),
                new PropertyDescriptor(PROP_RESOURCE, "Configuration File") };
        DESCRIPTORS[0].setDescription("SwitchYard application details.");
        DESCRIPTORS[1].setDescription("switchyard.xml file details.");
        DESCRIPTORS[1].setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return "";
            }

        });
    }
}
