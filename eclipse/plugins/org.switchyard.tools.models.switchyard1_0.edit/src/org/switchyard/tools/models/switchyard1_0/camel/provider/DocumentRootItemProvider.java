/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.CamelFactory;
import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_ATOM);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FILE);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTP);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_JMS);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_MOCK);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SEDA);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_TIMER);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_CAMEL);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_UDP);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_TCP);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_QUARTZ);
            childrenFeatures.add(CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SQL);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_DocumentRoot_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case CamelPackage.DOCUMENT_ROOT__BINDING_ATOM:
            case CamelPackage.DOCUMENT_ROOT__BINDING_CAMEL:
            case CamelPackage.DOCUMENT_ROOT__BINDING_DIRECT:
            case CamelPackage.DOCUMENT_ROOT__BINDING_FILE:
            case CamelPackage.DOCUMENT_ROOT__BINDING_FTP:
            case CamelPackage.DOCUMENT_ROOT__BINDING_FTPS:
            case CamelPackage.DOCUMENT_ROOT__BINDING_JMS:
            case CamelPackage.DOCUMENT_ROOT__BINDING_MOCK:
            case CamelPackage.DOCUMENT_ROOT__BINDING_SEDA:
            case CamelPackage.DOCUMENT_ROOT__BINDING_SFTP:
            case CamelPackage.DOCUMENT_ROOT__BINDING_TIMER:
            case CamelPackage.DOCUMENT_ROOT__IMPLEMENTATION_CAMEL:
            case CamelPackage.DOCUMENT_ROOT__BINDING_NETTY_UDP:
            case CamelPackage.DOCUMENT_ROOT__BINDING_NETTY_TCP:
            case CamelPackage.DOCUMENT_ROOT__BINDING_QUARTZ:
            case CamelPackage.DOCUMENT_ROOT__BINDING_SQL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_ATOM,
                 CamelFactory.eINSTANCE.createCamelAtomBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_CAMEL,
                 CamelFactory.eINSTANCE.createCamelBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_DIRECT,
                 CamelFactory.eINSTANCE.createCamelDirectBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FILE,
                 CamelFactory.eINSTANCE.createCamelFileBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                 CamelFactory.eINSTANCE.createCamelFtpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTP,
                 CamelFactory.eINSTANCE.createCamelFtpsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS,
                 CamelFactory.eINSTANCE.createCamelFtpsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_JMS,
                 CamelFactory.eINSTANCE.createCamelJmsBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_MOCK,
                 CamelFactory.eINSTANCE.createCamelMockBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SEDA,
                 CamelFactory.eINSTANCE.createCamelSedaBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SFTP,
                 CamelFactory.eINSTANCE.createCamelSftpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_TIMER,
                 CamelFactory.eINSTANCE.createCamelTimerBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__IMPLEMENTATION_CAMEL,
                 CamelFactory.eINSTANCE.createCamelImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_UDP,
                 CamelFactory.eINSTANCE.createCamelNettyUdpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_NETTY_TCP,
                 CamelFactory.eINSTANCE.createCamelNettyTcpBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_QUARTZ,
                 CamelFactory.eINSTANCE.createCamelQuartzBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (CamelPackage.Literals.DOCUMENT_ROOT__BINDING_SQL,
                 CamelFactory.eINSTANCE.createCamelSqlBindingType()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTP ||
            childFeature == CamelPackage.Literals.DOCUMENT_ROOT__BINDING_FTPS;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
