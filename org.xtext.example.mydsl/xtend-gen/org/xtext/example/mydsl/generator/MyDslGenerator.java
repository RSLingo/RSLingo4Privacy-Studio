/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.Disclosure;
import org.xtext.example.mydsl.myDsl.Informative;
import org.xtext.example.mydsl.myDsl.Partof;
import org.xtext.example.mydsl.myDsl.Policy;
import org.xtext.example.mydsl.myDsl.PrivateData;
import org.xtext.example.mydsl.myDsl.Recipient;
import org.xtext.example.mydsl.myDsl.RefPrivateData;
import org.xtext.example.mydsl.myDsl.ReferToRecipientSource;
import org.xtext.example.mydsl.myDsl.ReferToRecipientTarget;
import org.xtext.example.mydsl.myDsl.ReferToService;
import org.xtext.example.mydsl.myDsl.Retention;
import org.xtext.example.mydsl.myDsl.Service;
import org.xtext.example.mydsl.myDsl.ServicePartof;
import org.xtext.example.mydsl.myDsl.Usage;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".policy");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Policy> _filter = Iterators.<Policy>filter(_allContents, Policy.class);
    final Function1<Policy, CharSequence> _function = (Policy it) -> {
      return this.compilepo(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Policy, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, " ");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compilepo(final Policy policy) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SPEC HEADER");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTR NAMESPACE \"http://gaius.isri.cmu.edu/example2.owl\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ATTR DESC \"This policy is written to test the use limitation principle\"");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<Recipient> _recipient = policy.getRecipient();
      boolean _isEmpty = _recipient.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Recipient> _recipient_1 = policy.getRecipient();
          for(final Recipient x : _recipient_1) {
            CharSequence _compileActor = this.compileActor(x);
            _builder.append(_compileActor, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Service> _service = policy.getService();
      boolean _isEmpty_1 = _service.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        {
          EList<Service> _service_1 = policy.getService();
          for(final Service z : _service_1) {
            CharSequence _compilepurpose = this.compilepurpose(z);
            _builder.append(_compilepurpose, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<PrivateData> _privateData = policy.getPrivateData();
      boolean _isEmpty_2 = _privateData.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        {
          EList<PrivateData> _privateData_1 = policy.getPrivateData();
          for(final PrivateData y : _privateData_1) {
            CharSequence _compiledetum = this.compiledetum(y);
            _builder.append(_compiledetum, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("D ALL-Information > ");
    {
      EList<PrivateData> _privateData_2 = policy.getPrivateData();
      boolean _isEmpty_3 = _privateData_2.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        {
          EList<PrivateData> _privateData_3 = policy.getPrivateData();
          boolean _hasElements = false;
          for(final PrivateData z_1 : _privateData_3) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compileall = this.compileall(z_1);
            _builder.append(_compileall, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("SPEC POLICY");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<Collection> _collection = policy.getCollection();
      boolean _isEmpty_4 = _collection.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        {
          EList<Collection> _collection_1 = policy.getCollection();
          for(final Collection x_1 : _collection_1) {
            CharSequence _compilecollection = this.compilecollection(x_1);
            _builder.append(_compilecollection, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Disclosure> _disclosure = policy.getDisclosure();
      boolean _isEmpty_5 = _disclosure.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        {
          EList<Disclosure> _disclosure_1 = policy.getDisclosure();
          for(final Disclosure x_2 : _disclosure_1) {
            CharSequence _compiletransfer = this.compiletransfer(x_2);
            _builder.append(_compiletransfer, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Retention> _retention = policy.getRetention();
      boolean _isEmpty_6 = _retention.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        {
          EList<Retention> _retention_1 = policy.getRetention();
          for(final Retention x_3 : _retention_1) {
            CharSequence _compileretention = this.compileretention(x_3);
            _builder.append(_compileretention, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Usage> _usage = policy.getUsage();
      boolean _isEmpty_7 = _usage.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        {
          EList<Usage> _usage_1 = policy.getUsage();
          for(final Usage x_4 : _usage_1) {
            CharSequence _compileusage = this.compileusage(x_4);
            _builder.append(_compileusage, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Informative> _informative = policy.getInformative();
      boolean _isEmpty_8 = _informative.isEmpty();
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        {
          EList<Informative> _informative_1 = policy.getInformative();
          for(final Informative x_5 : _informative_1) {
            CharSequence _compileinformative = this.compileinformative(x_5);
            _builder.append(_compileinformative, "\t");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileall(final PrivateData all) {
    StringConcatenation _builder = new StringConcatenation();
    String _privatedata = all.getPrivatedata();
    _builder.append(_privatedata, "");
    return _builder;
  }
  
  public CharSequence compileActor(final Recipient r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Partof> _partof = r.getPartof();
      boolean _isEmpty = _partof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("A ");
        String _recipientname = r.getRecipientname();
        _builder.append(_recipientname, "");
        _builder.append(" > ");
        {
          EList<Partof> _partof_1 = r.getPartof();
          boolean _hasElements = false;
          for(final Partof part : _partof_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilepart = this.compilepart(part);
            _builder.append(_compilepart, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilepart(final Partof part) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _partof = part.getPartof();
    String _recipientname = _partof.getRecipientname();
    _builder.append(_recipientname, "");
    return _builder;
  }
  
  public CharSequence compilepurpose(final Service se) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ServicePartof> _servicepartof = se.getServicepartof();
      boolean _isEmpty = _servicepartof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("P ");
        String _servicename = se.getServicename();
        _builder.append(_servicename, "");
        _builder.append(" > ");
        {
          EList<ServicePartof> _servicepartof_1 = se.getServicepartof();
          boolean _hasElements = false;
          for(final ServicePartof pur : _servicepartof_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilepurpose = this.compilepurpose(pur);
            _builder.append(_compilepurpose, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilepurpose(final ServicePartof pur) {
    StringConcatenation _builder = new StringConcatenation();
    Service _refertoservice = pur.getRefertoservice();
    String _servicename = _refertoservice.getServicename();
    _builder.append(_servicename, "");
    return _builder;
  }
  
  public CharSequence compiledetum(final PrivateData pd) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = pd.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        _builder.append("D ");
        String _privatedata = pd.getPrivatedata();
        _builder.append(_privatedata, "");
        _builder.append(" > ");
        {
          EList<Attribute> _attribute = pd.getAttribute();
          boolean _hasElements = false;
          for(final Attribute pdat : _attribute) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiledetumat = this.compiledetumat(pdat);
            _builder.append(_compiledetumat, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compiledetumat(final Attribute pdat) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = pdat.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilecollection(final Collection coll) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _modalitykind = coll.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permitted");
      if (_equals) {
        _builder.append("P ");
      } else {
        String _modalitykind_1 = coll.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("O ");
        } else {
          _builder.append("R ");
        }
      }
    }
    _builder.append("COLLECT ");
    {
      EList<RefPrivateData> _refprivatedata = coll.getRefprivatedata();
      int _length = ((Object[])Conversions.unwrapArray(_refprivatedata, Object.class)).length;
      boolean _equals_2 = (_length == 8);
      if (_equals_2) {
        _builder.append("ALL-Information ");
      } else {
        {
          EList<RefPrivateData> _refprivatedata_1 = coll.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilep = this.compilep(p);
            _builder.append(_compilep, "");
            _builder.append(" ");
          }
        }
      }
    }
    {
      EList<ReferToService> _refertoservice = coll.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("FOR ");
        {
          EList<ReferToService> _refertoservice_1 = coll.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiles = this.compiles(b);
            _builder.append(_compiles, "");
          }
        }
      } else {
        _builder.append("FOR Anything");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compiletransfer(final Disclosure tran) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _modalitykind = tran.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permitted");
      if (_equals) {
        _builder.append("P ");
      } else {
        String _modalitykind_1 = tran.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("O ");
        } else {
          _builder.append("R ");
        }
      }
    }
    _builder.append("TRANSFER ");
    {
      EList<RefPrivateData> _refprivatedata = tran.getRefprivatedata();
      int _length = ((Object[])Conversions.unwrapArray(_refprivatedata, Object.class)).length;
      boolean _equals_2 = (_length == 8);
      if (_equals_2) {
        _builder.append("ALL-Information ");
      } else {
        {
          EList<RefPrivateData> _refprivatedata_1 = tran.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilep = this.compilep(p);
            _builder.append(_compilep, "");
            _builder.append(" ");
          }
        }
      }
    }
    {
      EList<ReferToRecipientSource> _referToRecipientsource = tran.getReferToRecipientsource();
      boolean _isEmpty = _referToRecipientsource.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("FROM ");
        {
          EList<ReferToRecipientSource> _referToRecipientsource_1 = tran.getReferToRecipientsource();
          boolean _hasElements_1 = false;
          for(final ReferToRecipientSource rs : _referToRecipientsource_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiler = this.compiler(rs);
            _builder.append(_compiler, "");
          }
        }
        _builder.append(" ");
      }
    }
    {
      EList<ReferToRecipientTarget> _referToRecipienttarget = tran.getReferToRecipienttarget();
      boolean _isEmpty_1 = _referToRecipienttarget.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("TO ");
        {
          EList<ReferToRecipientTarget> _referToRecipienttarget_1 = tran.getReferToRecipienttarget();
          boolean _hasElements_2 = false;
          for(final ReferToRecipientTarget rt : _referToRecipienttarget_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiler_1 = this.compiler(rt);
            _builder.append(_compiler_1, "");
          }
        }
        _builder.append(" ");
      }
    }
    {
      EList<ReferToService> _refertoservice = tran.getRefertoservice();
      boolean _isEmpty_2 = _refertoservice.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("FOR ");
        {
          EList<ReferToService> _refertoservice_1 = tran.getRefertoservice();
          boolean _hasElements_3 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiles = this.compiles(b);
            _builder.append(_compiles, "");
          }
        }
      } else {
        _builder.append("FOR Anything");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileretention(final Retention ret) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _modalitykind = ret.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permitted");
      if (_equals) {
        _builder.append("P ");
      } else {
        String _modalitykind_1 = ret.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("O ");
        } else {
          _builder.append("R ");
        }
      }
    }
    _builder.append("RETAIN ");
    {
      EList<RefPrivateData> _refprivatedata = ret.getRefprivatedata();
      int _length = ((Object[])Conversions.unwrapArray(_refprivatedata, Object.class)).length;
      boolean _equals_2 = (_length == 8);
      if (_equals_2) {
        _builder.append("ALL-Information ");
      } else {
        {
          EList<RefPrivateData> _refprivatedata_1 = ret.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilep = this.compilep(p);
            _builder.append(_compilep, "");
            _builder.append(" ");
          }
        }
      }
    }
    {
      EList<ReferToService> _refertoservice = ret.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("FOR ");
        {
          EList<ReferToService> _refertoservice_1 = ret.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiles = this.compiles(b);
            _builder.append(_compiles, "");
          }
        }
      } else {
        _builder.append("FOR Anything");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileusage(final Usage use) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _modalitykind = use.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permitted");
      if (_equals) {
        _builder.append("P ");
      } else {
        String _modalitykind_1 = use.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("O ");
        } else {
          _builder.append("R ");
        }
      }
    }
    _builder.append("USE ");
    {
      EList<RefPrivateData> _refprivatedata = use.getRefprivatedata();
      int _length = ((Object[])Conversions.unwrapArray(_refprivatedata, Object.class)).length;
      boolean _equals_2 = (_length == 8);
      if (_equals_2) {
        _builder.append("ALL-Information ");
      } else {
        {
          EList<RefPrivateData> _refprivatedata_1 = use.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilep = this.compilep(p);
            _builder.append(_compilep, "");
            _builder.append(" ");
          }
        }
      }
    }
    {
      EList<ReferToService> _refertoservice = use.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("FOR ");
        {
          EList<ReferToService> _refertoservice_1 = use.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiles = this.compiles(b);
            _builder.append(_compiles, "");
          }
        }
      } else {
        _builder.append("FOR Anything");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileinformative(final Informative inf) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _modalitykind = inf.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permitted");
      if (_equals) {
        _builder.append("P ");
      } else {
        String _modalitykind_1 = inf.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("O ");
        } else {
          _builder.append("R ");
        }
      }
    }
    _builder.append("INFORM ");
    {
      EList<RefPrivateData> _refprivatedata = inf.getRefprivatedata();
      int _length = ((Object[])Conversions.unwrapArray(_refprivatedata, Object.class)).length;
      boolean _equals_2 = (_length == 8);
      if (_equals_2) {
        _builder.append("ALL-Information ");
        {
          EList<RefPrivateData> _refprivatedata_1 = inf.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilep = this.compilep(p);
            _builder.append(_compilep, "");
            _builder.append(" ");
          }
        }
      }
    }
    {
      EList<ReferToService> _refertoservice = inf.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("FOR ");
        {
          EList<ReferToService> _refertoservice_1 = inf.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compiles = this.compiles(b);
            _builder.append(_compiles, "");
          }
        }
      } else {
        _builder.append("FOR Anything");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compiler(final ReferToRecipientSource rs) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _refertore = rs.getRefertore();
    String _recipientname = _refertore.getRecipientname();
    _builder.append(_recipientname, "");
    return _builder;
  }
  
  public CharSequence compiler(final ReferToRecipientTarget rt) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _refertore = rt.getRefertore();
    String _recipientname = _refertore.getRecipientname();
    _builder.append(_recipientname, "");
    return _builder;
  }
  
  public CharSequence compilep(final RefPrivateData p) {
    StringConcatenation _builder = new StringConcatenation();
    PrivateData _refpr = p.getRefpr();
    String _privatedata = _refpr.getPrivatedata();
    _builder.append(_privatedata, "");
    return _builder;
  }
  
  public CharSequence compiles(final ReferToService b) {
    StringConcatenation _builder = new StringConcatenation();
    Service _refertose = b.getRefertose();
    String _servicename = _refertose.getServicename();
    _builder.append(_servicename, "");
    return _builder;
  }
}
