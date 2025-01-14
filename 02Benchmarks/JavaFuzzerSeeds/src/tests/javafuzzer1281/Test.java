package tests.javafuzzer1281;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:40:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1361237477L;
    public static short sFld=-32105;
    public static float fFld=89.634F;
    public static long lArrFld[]=new long[N];
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3798807598L);
        FuzzerUtils.init(Test.dArrFld, 69.116432);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, int i3, short s) {

        int i4=-3, i6=253, i7=-7, i8=-145, i9=0, iArr[]=new int[N];
        float f=82.370F;
        boolean b=false;

        FuzzerUtils.init(iArr, 182);

        Test.instanceCount |= -57;
        i2 = i2;
        i4 = 1;
        while (++i4 < 163) {
            Test.instanceCount *= (long)f;
            if (i3 != 0) {
            }
        }
        i3 -= (int)Test.instanceCount;
        Test.lArrFld[(i2 >>> 1) % N] = Test.instanceCount;
        for (int i5 : iArr) {
            i2 = 94;
            i5 = (int)160L;
            for (i6 = 1; i6 < 4; ++i6) {
                i2 += (int)Test.instanceCount;
                for (i8 = i6; i8 < 2; ++i8) {
                    b = b;
                    i3 += i9;
                }
            }
        }
        long meth_res = i2 + i3 + s + i4 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, double d, int i1) {

        short s1=11268, sArr[]=new short[N];
        int i10=84, i11=-56961, i12=-25888, i13=1, i14=-112, i15=-8, i16=-42701, i17=59, i18=14, iArr1[]=new int[N];
        boolean b1=true;
        byte by1=-109, byArr[]=new byte[N];
        float f1=-62.894F;

        FuzzerUtils.init(iArr1, -3163);
        FuzzerUtils.init(byArr, (byte)66);
        FuzzerUtils.init(sArr, (short)8699);

        i *= iMeth(1, i, s1);
        for (i10 = 8; i10 < 321; ++i10) {
            try {
                iArr1[i10] = (-870 / i11);
                iArr1[i10 - 1] = (i12 % -46);
                i12 = (-51789 / i11);
            } catch (ArithmeticException a_e) {}
            s1 = (short)i1;
            for (i13 = 1; i13 < 5; ++i13) {
                i11 += (i13 | s1);
                for (i15 = 1; 2 > i15; i15++) {
                    byArr[i10 - 1] <<= (byte)i14;
                    if (b1) break;
                    Test.instanceCount = i;
                }
                for (i17 = 1; 2 > i17; i17++) {
                    sArr[i10 - 1] = by1;
                    i = 47206;
                }
            }
            i11 = (int)f1;
            d = f1;
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + i1 + s1 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b1 ? 1
            : 0) + i17 + i18 + by1 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(sArr);
    }

    public short sMeth() {

        int i19=191;
        double d1=-63.78064;

        vMeth(i19, d1, i19);
        Test.sFld += (short)i19;
        i19 -= i19;
        i19 *= (int)d1;
        i19 -= (int)Test.instanceCount;
        Test.fFld = Test.instanceCount;
        Test.fFld -= i19;
        i19 >>= 170;
        long meth_res = i19 + Double.doubleToLongBits(d1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=-64;
        long l=121L;
        int i20=-11, i21=-1, i22=6, i23=105, i24=-4394, i25=217, i26=0, i27=-233, i28=-6196;
        double d2=2.3474;
        short sArr1[]=new short[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(sArr1, (short)8885);
        FuzzerUtils.init(fArr, 0.979F);

        by <<= (byte)sMeth();
        Test.instanceCount = Test.instanceCount;
        for (l = 15; l < 305; ++l) {
            i20 += (int)l;
            for (i21 = 3; i21 < 87; i21++) {
                i22 += i21;
                sArr1[i21 + 1] = (short)i22;
                i22 <<= by;
                i20 = 6;
                Test.dArrFld[i21] += 60610L;
                for (i23 = 1; i23 < 2; i23++) {
                    i22 = i20;
                    i20 /= 36;
                    d2 -= l;
                    i22 = i22;
                    d2 *= -125.187F;
                    i20 += i22;
                    i22 += (((i23 * Test.instanceCount) + i22) - i22);
                    d2 = d2;
                }
            }
            i24 >>= i21;
            Test.fFld = l;
            i24 += (int)(l - Test.fFld);
            fArr[(int)(l)] = i24;
            for (i25 = 87; 4 < i25; i25--) {
                for (i27 = (int)(l); i27 < 2; i27++) {
                    i28 >>= (int)l;
                    i22 += (i27 - Test.fFld);
                    iArrFld[i27 - 1] += 17;
                    i24 = 29699;
                    i24 += (int)Test.fFld;
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
