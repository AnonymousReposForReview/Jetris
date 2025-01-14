package tests.javafuzzer951;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:00:21 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-514913586L;
    public static short sFld=22083;
    public static double dFld=58.53759;
    public long lFld=40935L;

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, double d, int i3) {

        double d1=-74.126487, d2=0.123208;
        int i4=11, i5=53, i6=-4, i7=13, i8=-6;
        byte by1=5;
        boolean b1=true;

        d1 = 1;
        while (++d1 < 246) {
            for (d2 = d1; 7 > d2; d2++) {
                i3 += i3;
                Test.sFld -= (short)d;
                i4 *= (int)l1;
                i4 <<= by1;
            }
            if (b1) break;
            i3 = 41733;
            i3 *= i4;
            i4 += (int)(d1 * d1);
            for (i5 = 1; i5 < 7; ++i5) {
                i3 += (int)(-1035626814750413369L + (i5 * i5));
                for (i7 = 1; i7 < 2; ++i7) {
                    i3 <<= i3;
                    Test.instanceCount >>= i7;
                }
            }
        }
        long meth_res = l1 + Double.doubleToLongBits(d) + i3 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + i4 + by1 + (b1 ? 1 : 0) + i5 + i6 + i7 + i8;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, boolean b) {

        int i2=6, i9=-1, i10=-203, i11=9, i12=0, i13=12, i14=-106, iArr1[]=new int[N];
        float f1=-97.923F;
        byte by2=25;

        FuzzerUtils.init(iArr1, -5675);

        i2 &= iMeth(l, Test.dFld, i2);
        for (i9 = 18; i9 < 377; i9++) {
            for (i11 = 1; 5 > i11; i11++) {
                f1 += (3869938167094098106L + (i11 * i11));
                for (i13 = 1; i13 < 2; ++i13) {
                    iArr1[i13 - 1] *= i2;
                    by2 <<= (byte)i14;
                    b = b;
                    f1 *= i10;
                    i14 = (int)-3410118322L;
                    l = (long)19.9242;
                    i14 -= (int)l;
                    i10 |= (int)Test.instanceCount;
                }
                i14 = (int)Test.instanceCount;
                f1 -= i14;
            }
        }
        vMeth_check_sum += l + (b ? 1 : 0) + i2 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + by2 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static long lMeth() {

        boolean b2=false;

        vMeth(Test.instanceCount, b2);
        long meth_res = (b2 ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=-84, i15=-2, i16=14653, i17=7, i18=-166, i19=58832, i20=-4754, i21=-53479, i22=-11, i23=-12619,
            i24=45913, iArr[]=new int[N];
        byte by=113;
        float f=119.258F, fArr[]=new float[N];
        boolean b3=true, b4=false;
        double d3=40.43801;

        FuzzerUtils.init(iArr, 293);
        FuzzerUtils.init(fArr, -19.496F);

        for (i = 6; i < 275; i++) {
            by = (byte)(-Integer.reverseBytes(i1--));
            i1 = (++iArr[i]);
            i1 += iArr[i];
        }
        Test.instanceCount -= (long)((i1 = (i1++)) - (i1 - (f--)));
        Test.instanceCount *= lMeth();
        f = Test.instanceCount;
        i1 -= Test.sFld;
        iArr = iArr;
        b3 = b3;
        i1 = (int)-55729L;
        i1 += (int)f;
        i15 = 1;
        do {
            lFld -= (long)f;
            fArr[i15] = Test.instanceCount;
            i1 *= i1;
            i1 += i15;
        } while (++i15 < 369);
        i16 = 1;
        do {
            i1 += (i16 + i);
            i1 += 252;
            for (i17 = 4; i17 < 76; ++i17) {
                if (b4) continue;
            }
        } while (++i16 < 332);
        i18 += i15;
        for (i19 = 220; i19 > 1; i19--) {
            for (i21 = 115; i21 > 3; i21--) {
                for (i23 = 1; i23 < 2; i23++) {
                    lFld += (long)d3;
                    i18 <<= (int)Test.instanceCount;
                    lFld -= lFld;
                    i22 >>= 2;
                }
            }
        }



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
