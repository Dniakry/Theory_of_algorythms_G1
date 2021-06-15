package knu.fit.ist.ta.Lab5;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Model {
    private String _stringField;
    private Short _shortField;

    public Model(String stringField, short shortField) {
        _stringField = stringField;
        _shortField = shortField;
    }

    public String getStringField() {
        return _stringField;
    }

    public void setStringField(String stringField) {
        _stringField = stringField;
    }

    public Short getShortField() {
        return _shortField;
    }

    public void setShortField(short shortField) {
        _shortField = shortField;
    }

    @Override
    public String toString() {
        return "Model{" + "StringField=" + _stringField + ", ShortField=" + _shortField + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Model other = (Model) obj;
        if (this._shortField != other._shortField)
            return false;
        if (!Objects.equals(this._stringField, other._stringField))
            return false;
        return true;
    }
}
