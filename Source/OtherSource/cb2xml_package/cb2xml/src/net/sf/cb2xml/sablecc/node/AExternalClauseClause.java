/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AExternalClauseClause extends PClause
{
    private PExternalClause _externalClause_;

    public AExternalClauseClause()
    {
        // Constructor
    }

    public AExternalClauseClause(
        @SuppressWarnings("hiding") PExternalClause _externalClause_)
    {
        // Constructor
        setExternalClause(_externalClause_);

    }

    @Override
    public Object clone()
    {
        return new AExternalClauseClause(
            cloneNode(this._externalClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternalClauseClause(this);
    }

    public PExternalClause getExternalClause()
    {
        return this._externalClause_;
    }

    public void setExternalClause(PExternalClause node)
    {
        if(this._externalClause_ != null)
        {
            this._externalClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._externalClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._externalClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._externalClause_ == child)
        {
            this._externalClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._externalClause_ == oldChild)
        {
            setExternalClause((PExternalClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
