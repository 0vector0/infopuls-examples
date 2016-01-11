package course01.calculatorTest;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;

public class FormatRound15 {


		
		 private String formatRomikk(double d, int length) {
		        if (d < 0) length--;

		        int exponent = (int) Math.log10(Math.abs(d)) + 1;

		        DecimalFormat format = null;
		        if (exponent == length) {
		            format = new DecimalFormat(
		                    String.valueOf(createCharArray(length)));
		        } else if (exponent > 0) {
		            if (exponent > length) {
		                format = new DecimalFormat("0." +
		                        String.valueOf(createCharArray(length - 4)) +
		                        "E0");
		            } else {
		                char[] c = createCharArray(length);
		                c[exponent] = '.';
		                format = new DecimalFormat(String.valueOf(c));
		            }
		        } else {
		            format = new DecimalFormat("0." + 
		                    String.valueOf(createCharArray(length - 5)) +
		                    "E0");
		        }

		        return format.format(d);

		    }

		    private char[] createCharArray(int length) {
		        char[] c = new char[length];
		        Arrays.fill(c, '#');
		        return c;
		    }

		    private String format(double d, int length) {
		        return formatRomikk(d, length);
		    }

		    public void testFormatRomikk() {
		        Locale.setDefault(Locale.US);
		        //assertEquals("1.2345", format(1.2345, 6));
		    //    assertEquals("1.2346", format(1.23456, 6));
		     //   assertEquals("-1.235", format(-1.23456, 6));
		     //   assertEquals("123456", format(123456, 6));
		     //   assertEquals("1.2346E8", format(123456789, 8));
		     //   assertEquals("-1.235E8", format(-123456789, 8));
		     //   assertEquals("1.23E-5", format(0.00001234567, 7));
		     //   assertEquals("-1.E-5", format(-0.00001234567, 6));
		    //    assertEquals("-1.23E-5", format(-0.00001234567, 8));
		    }
		
	}


