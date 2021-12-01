/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class APictureClauseClause extends PClause
{
    private PPictureClause _pictureClause_;

    public APictureClauseClause()
    {
        // Constructor
    }

    public APictureClauseClause(
        @SuppressWarnings("hiding") PPictureClause _pictureClause_)
    {
        // Constructor
        setPictureClause(_pictureClause_);

    }

    @Override
    public Object clone()
    {
        return new APictureClauseClause(
            cloneNode(this._pictureClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPictureClauseClause(this);
    }

    public PPictureClause getPictureClause()
    {
        return this._pictureClause_;
    }

    public void setPictureClause(PPictureClause node)
    {
        if(this._pictureClause_ != null)
        {
            this._pictureClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pictureClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pictureClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pictureClause_ == child)
        {
            this._pictureClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pictureClause_ == oldChild)
        {
            setPictureClause((PPictureClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}