/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.rules.preupdate;

/**
 *
 * @author emedina
 */
public interface BeforeCommit {
    
    public abstract boolean beforeCommitData();
    
}
