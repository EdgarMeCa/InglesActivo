/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search.criteria;

/**
 *
 * @author emedina
 */
public class LatePaymentSearchCriteria {
    private boolean empty;

    public LatePaymentSearchCriteria(boolean empty) {
        this.empty = empty;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }


}
