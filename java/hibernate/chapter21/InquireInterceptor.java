import java.io.Serializable;

import java.util.Iterator;

import net.sf.hibernate.Interceptor;

public class InquireInterceptor implements Interceptor, Serializable {

    public void onDelete(Object obj,
                         Serializable serial,
                         Object[] state,
                         String[] properties,
                         Type[] types) {

    }

    public boolean onFlushDirty(Object obj,
                                Serializable serial, 
                                Object[] currentState,
                                Object[] previousState,
                                String[] properties,
                                Type[] types) {

        if ( entity instanceof Inquire) {
            obj.flushDirty();
            return true;
        }
        return false;
    }

    public boolean onLoad(Object obj, 
                          Serializable serial,
                          Object[] state,
                          String[] properties,
                          Type[] types) {
        return false;
    }

    public boolean onSave(Object obj,
                          Serializable serial,
                          Object[] state,
                          String[] properties,
                          Type[] types) {
        
        if ( entity instanceof Inquire) {
            obj.beforeSave();
            return true;
        }
        return false;
    }

    public void postFlush(Iterator entities) {
    }

    public void preFlush(Iterator entities) {

    }
    
    public boolean isUnsaved(Object obj) { 
      // need to check each object attributes to determine if this should be saved or not
      return null;
    }

    public Object instantiate(Class class, 
                       Serialiable serial) {
      return null;
    }

    public int[] findDirty(Object obj, 
                           Serializable serial, 
                           Object[] currentState, 
                           Object[] previousState, 
                           String[] properties, 
                           Type[] types) {
      // Here we need to compare currentState with PreviousState and return array of ints
      // for each object that is different
      return null;
    }
}
