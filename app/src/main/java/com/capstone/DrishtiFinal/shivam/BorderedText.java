package com.capstone.DrishtiFinal.shivam;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;


 // To display text on the canvas

public class BorderedText {
  private final Paint interiorPaint;
  private final Paint exteriorPaint;

  private final float textSize;


  public BorderedText(final float textSize) {
    this(Color.WHITE, Color.BLACK, textSize);
  }

  public BorderedText(final int interiorColor, final int exteriorColor, final float textSize) {
    interiorPaint = new Paint();
    interiorPaint.setTextSize(textSize);
    interiorPaint.setColor(interiorColor);
    interiorPaint.setStyle(Style.FILL);
    interiorPaint.setAntiAlias(false);
    interiorPaint.setAlpha(255);

    exteriorPaint = new Paint();
    exteriorPaint.setTextSize(textSize);
    exteriorPaint.setColor(exteriorColor);
    exteriorPaint.setStyle(Style.FILL_AND_STROKE);
    exteriorPaint.setStrokeWidth(textSize / 8);
    exteriorPaint.setAntiAlias(false);
    exteriorPaint.setAlpha(255);

    this.textSize = textSize;
  }

  public void setTypeface(Typeface typeface) {
    interiorPaint.setTypeface(typeface);
    exteriorPaint.setTypeface(typeface);
  }

  public void drawText(final Canvas canvas, final float posX, final float posY, final String text) {
    canvas.drawText(text, posX, posY, exteriorPaint);
    canvas.drawText(text, posX, posY, interiorPaint);
  }

}
