/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.JCAInboundInteraction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JCAInboundInteractionItemProvider
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
	public JCAInboundInteractionItemProvider(AdapterFactory adapterFactory) {
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

			addListenerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Listener feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListenerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JCAInboundInteraction_listener_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JCAInboundInteraction_listener_feature", "_UI_JCAInboundInteraction_type"),
				 ScaPackage.eINSTANCE.getJCAInboundInteraction_Listener(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ScaPackage.eINSTANCE.getJCAInboundInteraction_InboundOperation());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJCAInboundInteraction_AnyAttribute());
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
	 * This returns JCAInboundInteraction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JCAInboundInteraction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JCAInboundInteraction)object).getListener();
		return label == null || label.length() == 0 ?
			getString("_UI_JCAInboundInteraction_type") :
			getString("_UI_JCAInboundInteraction_type") + " " + label;
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

		switch (notification.getFeatureID(JCAInboundInteraction.class)) {
			case ScaPackage.JCA_INBOUND_INTERACTION__LISTENER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScaPackage.JCA_INBOUND_INTERACTION__INBOUND_OPERATION:
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY:
			case ScaPackage.JCA_INBOUND_INTERACTION__ANY_ATTRIBUTE:
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
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_InboundOperation(),
				 ScaFactory.eINSTANCE.createInboundOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FROM,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA,
					 AddressingFactory.eINSTANCE.createMetadataType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION,
					 AddressingFactory.eINSTANCE.createProblemActionType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME,
					 AddressingFactory.eINSTANCE.createAttributedQNameType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS,
					 AddressingFactory.eINSTANCE.createReferenceParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO,
					 AddressingFactory.eINSTANCE.createRelatesToType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER,
					 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJCAInboundInteraction_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__TO,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO;

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
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
