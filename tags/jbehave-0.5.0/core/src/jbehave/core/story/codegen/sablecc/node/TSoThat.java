/* This file was generated by SableCC (http://www.sablecc.org/). */

package jbehave.core.story.codegen.sablecc.node;

import jbehave.core.story.codegen.sablecc.analysis.Analysis;

public final class TSoThat extends Token
{
    public TSoThat()
    {
        super.setText("So that");
    }

    public TSoThat(int line, int pos)
    {
        super.setText("So that");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TSoThat(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSoThat(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TSoThat text.");
    }
}