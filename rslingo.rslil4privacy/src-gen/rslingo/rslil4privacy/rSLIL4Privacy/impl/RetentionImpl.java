/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getPartRetention <em>Part Retention</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefPrivateData <em>Ref Private Data</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefPDAll <em>Ref PD All</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefSAll <em>Ref SAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefEnforcement <em>Ref Enforcement</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getRefEAll <em>Ref EAll</em>}</li>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.impl.RetentionImpl#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetentionImpl extends MinimalEObjectImpl.Container implements Retention
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartRetention() <em>Part Retention</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartRetention()
   * @generated
   * @ordered
   */
  protected Retention partRetention;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final String PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected String period = PERIOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefPrivateData() <em>Ref Private Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPrivateData()
   * @generated
   * @ordered
   */
  protected RefPrivateData refPrivateData;

  /**
   * The default value of the '{@link #getRefPDAll() <em>Ref PD All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPDAll()
   * @generated
   * @ordered
   */
  protected static final String REF_PD_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefPDAll() <em>Ref PD All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefPDAll()
   * @generated
   * @ordered
   */
  protected String refPDAll = REF_PD_ALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefService() <em>Ref Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefService()
   * @generated
   * @ordered
   */
  protected RefService refService;

  /**
   * The default value of the '{@link #getRefSAll() <em>Ref SAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSAll()
   * @generated
   * @ordered
   */
  protected static final String REF_SALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefSAll() <em>Ref SAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefSAll()
   * @generated
   * @ordered
   */
  protected String refSAll = REF_SALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefEnforcement() <em>Ref Enforcement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEnforcement()
   * @generated
   * @ordered
   */
  protected RefEnforcement refEnforcement;

  /**
   * The default value of the '{@link #getRefEAll() <em>Ref EAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEAll()
   * @generated
   * @ordered
   */
  protected static final String REF_EALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefEAll() <em>Ref EAll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEAll()
   * @generated
   * @ordered
   */
  protected String refEAll = REF_EALL_EDEFAULT;

  /**
   * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected static final String MODALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModality()
   * @generated
   * @ordered
   */
  protected String modality = MODALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RetentionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RSLIL4PrivacyPackage.Literals.RETENTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Retention getPartRetention()
  {
    if (partRetention != null && partRetention.eIsProxy())
    {
      InternalEObject oldPartRetention = (InternalEObject)partRetention;
      partRetention = (Retention)eResolveProxy(oldPartRetention);
      if (partRetention != oldPartRetention)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSLIL4PrivacyPackage.RETENTION__PART_RETENTION, oldPartRetention, partRetention));
      }
    }
    return partRetention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Retention basicGetPartRetention()
  {
    return partRetention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartRetention(Retention newPartRetention)
  {
    Retention oldPartRetention = partRetention;
    partRetention = newPartRetention;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__PART_RETENTION, oldPartRetention, partRetention));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(String newPeriod)
  {
    String oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPrivateData getRefPrivateData()
  {
    return refPrivateData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefPrivateData(RefPrivateData newRefPrivateData, NotificationChain msgs)
  {
    RefPrivateData oldRefPrivateData = refPrivateData;
    refPrivateData = newRefPrivateData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA, oldRefPrivateData, newRefPrivateData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPrivateData(RefPrivateData newRefPrivateData)
  {
    if (newRefPrivateData != refPrivateData)
    {
      NotificationChain msgs = null;
      if (refPrivateData != null)
        msgs = ((InternalEObject)refPrivateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA, null, msgs);
      if (newRefPrivateData != null)
        msgs = ((InternalEObject)newRefPrivateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA, null, msgs);
      msgs = basicSetRefPrivateData(newRefPrivateData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA, newRefPrivateData, newRefPrivateData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefPDAll()
  {
    return refPDAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefPDAll(String newRefPDAll)
  {
    String oldRefPDAll = refPDAll;
    refPDAll = newRefPDAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_PD_ALL, oldRefPDAll, refPDAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefService getRefService()
  {
    return refService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefService(RefService newRefService, NotificationChain msgs)
  {
    RefService oldRefService = refService;
    refService = newRefService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_SERVICE, oldRefService, newRefService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefService(RefService newRefService)
  {
    if (newRefService != refService)
    {
      NotificationChain msgs = null;
      if (refService != null)
        msgs = ((InternalEObject)refService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_SERVICE, null, msgs);
      if (newRefService != null)
        msgs = ((InternalEObject)newRefService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_SERVICE, null, msgs);
      msgs = basicSetRefService(newRefService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_SERVICE, newRefService, newRefService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefSAll()
  {
    return refSAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefSAll(String newRefSAll)
  {
    String oldRefSAll = refSAll;
    refSAll = newRefSAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_SALL, oldRefSAll, refSAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEnforcement getRefEnforcement()
  {
    return refEnforcement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefEnforcement(RefEnforcement newRefEnforcement, NotificationChain msgs)
  {
    RefEnforcement oldRefEnforcement = refEnforcement;
    refEnforcement = newRefEnforcement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT, oldRefEnforcement, newRefEnforcement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEnforcement(RefEnforcement newRefEnforcement)
  {
    if (newRefEnforcement != refEnforcement)
    {
      NotificationChain msgs = null;
      if (refEnforcement != null)
        msgs = ((InternalEObject)refEnforcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT, null, msgs);
      if (newRefEnforcement != null)
        msgs = ((InternalEObject)newRefEnforcement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT, null, msgs);
      msgs = basicSetRefEnforcement(newRefEnforcement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT, newRefEnforcement, newRefEnforcement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefEAll()
  {
    return refEAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefEAll(String newRefEAll)
  {
    String oldRefEAll = refEAll;
    refEAll = newRefEAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__REF_EALL, oldRefEAll, refEAll));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModality()
  {
    return modality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModality(String newModality)
  {
    String oldModality = modality;
    modality = newModality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RSLIL4PrivacyPackage.RETENTION__MODALITY, oldModality, modality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA:
        return basicSetRefPrivateData(null, msgs);
      case RSLIL4PrivacyPackage.RETENTION__REF_SERVICE:
        return basicSetRefService(null, msgs);
      case RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT:
        return basicSetRefEnforcement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.RETENTION__NAME:
        return getName();
      case RSLIL4PrivacyPackage.RETENTION__DESCRIPTION:
        return getDescription();
      case RSLIL4PrivacyPackage.RETENTION__CONDITION:
        return getCondition();
      case RSLIL4PrivacyPackage.RETENTION__PART_RETENTION:
        if (resolve) return getPartRetention();
        return basicGetPartRetention();
      case RSLIL4PrivacyPackage.RETENTION__PERIOD:
        return getPeriod();
      case RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA:
        return getRefPrivateData();
      case RSLIL4PrivacyPackage.RETENTION__REF_PD_ALL:
        return getRefPDAll();
      case RSLIL4PrivacyPackage.RETENTION__REF_SERVICE:
        return getRefService();
      case RSLIL4PrivacyPackage.RETENTION__REF_SALL:
        return getRefSAll();
      case RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT:
        return getRefEnforcement();
      case RSLIL4PrivacyPackage.RETENTION__REF_EALL:
        return getRefEAll();
      case RSLIL4PrivacyPackage.RETENTION__MODALITY:
        return getModality();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.RETENTION__NAME:
        setName((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__CONDITION:
        setCondition((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__PART_RETENTION:
        setPartRetention((Retention)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__PERIOD:
        setPeriod((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_PD_ALL:
        setRefPDAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_SERVICE:
        setRefService((RefService)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_SALL:
        setRefSAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT:
        setRefEnforcement((RefEnforcement)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_EALL:
        setRefEAll((String)newValue);
        return;
      case RSLIL4PrivacyPackage.RETENTION__MODALITY:
        setModality((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.RETENTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__PART_RETENTION:
        setPartRetention((Retention)null);
        return;
      case RSLIL4PrivacyPackage.RETENTION__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA:
        setRefPrivateData((RefPrivateData)null);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_PD_ALL:
        setRefPDAll(REF_PD_ALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_SERVICE:
        setRefService((RefService)null);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_SALL:
        setRefSAll(REF_SALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT:
        setRefEnforcement((RefEnforcement)null);
        return;
      case RSLIL4PrivacyPackage.RETENTION__REF_EALL:
        setRefEAll(REF_EALL_EDEFAULT);
        return;
      case RSLIL4PrivacyPackage.RETENTION__MODALITY:
        setModality(MODALITY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RSLIL4PrivacyPackage.RETENTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RSLIL4PrivacyPackage.RETENTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RSLIL4PrivacyPackage.RETENTION__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case RSLIL4PrivacyPackage.RETENTION__PART_RETENTION:
        return partRetention != null;
      case RSLIL4PrivacyPackage.RETENTION__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
      case RSLIL4PrivacyPackage.RETENTION__REF_PRIVATE_DATA:
        return refPrivateData != null;
      case RSLIL4PrivacyPackage.RETENTION__REF_PD_ALL:
        return REF_PD_ALL_EDEFAULT == null ? refPDAll != null : !REF_PD_ALL_EDEFAULT.equals(refPDAll);
      case RSLIL4PrivacyPackage.RETENTION__REF_SERVICE:
        return refService != null;
      case RSLIL4PrivacyPackage.RETENTION__REF_SALL:
        return REF_SALL_EDEFAULT == null ? refSAll != null : !REF_SALL_EDEFAULT.equals(refSAll);
      case RSLIL4PrivacyPackage.RETENTION__REF_ENFORCEMENT:
        return refEnforcement != null;
      case RSLIL4PrivacyPackage.RETENTION__REF_EALL:
        return REF_EALL_EDEFAULT == null ? refEAll != null : !REF_EALL_EDEFAULT.equals(refEAll);
      case RSLIL4PrivacyPackage.RETENTION__MODALITY:
        return MODALITY_EDEFAULT == null ? modality != null : !MODALITY_EDEFAULT.equals(modality);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", condition: ");
    result.append(condition);
    result.append(", period: ");
    result.append(period);
    result.append(", refPDAll: ");
    result.append(refPDAll);
    result.append(", refSAll: ");
    result.append(refSAll);
    result.append(", refEAll: ");
    result.append(refEAll);
    result.append(", modality: ");
    result.append(modality);
    result.append(')');
    return result.toString();
  }

} //RetentionImpl
