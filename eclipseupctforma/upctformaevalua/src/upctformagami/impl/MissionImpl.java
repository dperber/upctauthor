/**
 */
package upctformagami.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctforma.Unit;

import upctformaevalua.EvaluationUnit;

import upctformagami.Mission;
import upctformagami.ScoreRange;
import upctformagami.TypeMissions;
import upctformagami.UpctformagamiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformagami.impl.MissionImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctformagami.impl.MissionImpl#getNextunit <em>Nextunit</em>}</li>
 *   <li>{@link upctformagami.impl.MissionImpl#getNexteval <em>Nexteval</em>}</li>
 *   <li>{@link upctformagami.impl.MissionImpl#getMissionrange <em>Missionrange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeMissions TYPE_EDEFAULT = TypeMissions.STRONG;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeMissions type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextunit() <em>Nextunit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextunit()
	 * @generated
	 * @ordered
	 */
	protected Unit nextunit;

	/**
	 * The cached value of the '{@link #getNexteval() <em>Nexteval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNexteval()
	 * @generated
	 * @ordered
	 */
	protected EvaluationUnit nexteval;

	/**
	 * The cached value of the '{@link #getMissionrange() <em>Missionrange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionrange()
	 * @generated
	 * @ordered
	 */
	protected EList<ScoreRange> missionrange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformagamiPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMissions getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeMissions newType) {
		TypeMissions oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.MISSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getNextunit() {
		if (nextunit != null && nextunit.eIsProxy()) {
			InternalEObject oldNextunit = (InternalEObject)nextunit;
			nextunit = (Unit)eResolveProxy(oldNextunit);
			if (nextunit != oldNextunit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamiPackage.MISSION__NEXTUNIT, oldNextunit, nextunit));
			}
		}
		return nextunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetNextunit() {
		return nextunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextunit(Unit newNextunit) {
		Unit oldNextunit = nextunit;
		nextunit = newNextunit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.MISSION__NEXTUNIT, oldNextunit, nextunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationUnit getNexteval() {
		if (nexteval != null && nexteval.eIsProxy()) {
			InternalEObject oldNexteval = (InternalEObject)nexteval;
			nexteval = (EvaluationUnit)eResolveProxy(oldNexteval);
			if (nexteval != oldNexteval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformagamiPackage.MISSION__NEXTEVAL, oldNexteval, nexteval));
			}
		}
		return nexteval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationUnit basicGetNexteval() {
		return nexteval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNexteval(EvaluationUnit newNexteval) {
		EvaluationUnit oldNexteval = nexteval;
		nexteval = newNexteval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformagamiPackage.MISSION__NEXTEVAL, oldNexteval, nexteval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScoreRange> getMissionrange() {
		if (missionrange == null) {
			missionrange = new EObjectContainmentEList<ScoreRange>(ScoreRange.class, this, UpctformagamiPackage.MISSION__MISSIONRANGE);
		}
		return missionrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformagamiPackage.MISSION__MISSIONRANGE:
				return ((InternalEList<?>)getMissionrange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformagamiPackage.MISSION__TYPE:
				return getType();
			case UpctformagamiPackage.MISSION__NEXTUNIT:
				if (resolve) return getNextunit();
				return basicGetNextunit();
			case UpctformagamiPackage.MISSION__NEXTEVAL:
				if (resolve) return getNexteval();
				return basicGetNexteval();
			case UpctformagamiPackage.MISSION__MISSIONRANGE:
				return getMissionrange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformagamiPackage.MISSION__TYPE:
				setType((TypeMissions)newValue);
				return;
			case UpctformagamiPackage.MISSION__NEXTUNIT:
				setNextunit((Unit)newValue);
				return;
			case UpctformagamiPackage.MISSION__NEXTEVAL:
				setNexteval((EvaluationUnit)newValue);
				return;
			case UpctformagamiPackage.MISSION__MISSIONRANGE:
				getMissionrange().clear();
				getMissionrange().addAll((Collection<? extends ScoreRange>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UpctformagamiPackage.MISSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformagamiPackage.MISSION__NEXTUNIT:
				setNextunit((Unit)null);
				return;
			case UpctformagamiPackage.MISSION__NEXTEVAL:
				setNexteval((EvaluationUnit)null);
				return;
			case UpctformagamiPackage.MISSION__MISSIONRANGE:
				getMissionrange().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UpctformagamiPackage.MISSION__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformagamiPackage.MISSION__NEXTUNIT:
				return nextunit != null;
			case UpctformagamiPackage.MISSION__NEXTEVAL:
				return nexteval != null;
			case UpctformagamiPackage.MISSION__MISSIONRANGE:
				return missionrange != null && !missionrange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MissionImpl