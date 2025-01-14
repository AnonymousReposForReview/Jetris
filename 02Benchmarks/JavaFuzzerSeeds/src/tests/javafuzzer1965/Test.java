package tests.javafuzzer1965;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:41:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3293775516854032175L;
    public static short sFld=1202;
    public volatile float fFld=0.201F;
    public static byte byArrFld[]=new byte[N];
    public static volatile int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)33);
        FuzzerUtils.init(Test.iArrFld, 6);
        FuzzerUtils.init(Test.lArrFld, 2681L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i9, int i10, boolean b1) {

        int i11=7, i12=-59130, i13=241, i14=-6;
        long l=-2249290609L;
        float f=0.893F, fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(fArr, -2.873F);

        for (i11 = 338; i11 > 6; i11--) {
            l = 1;
            while ((l += 2) < 5) {
                i13 = 1;
                do {
                    b1 = b1;
                    f += i13;
                    Test.byArrFld[i11] *= (byte)i10;
                    i14 = (int)Test.instanceCount;
                    i10 *= (int)1.130801;
                    bArr[i13 + 1] = true;
                    i10 -= (int)4L;
                    fArr[(35 >>> 1) % N] = i9;
                    i10 += i11;
                    Test.iArrFld[i13] >>>= (int)-2072813115L;
                } while ((i13 += 2) < 3);
                Test.instanceCount -= 43546;
                i14 += (int)(l * i13);
            }
        }
        vMeth2_check_sum += i9 + i10 + (b1 ? 1 : 0) + i11 + i12 + l + i13 + Float.floatToIntBits(f) + i14 +
            FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth1(int i4) {

        int i5=11, i6=-28997, i7=254, i8=-11, i15=62758, i16=11, i17=44595;
        boolean b=true;
        float f1=0.596F;

        for (i5 = 12; i5 < 257; ++i5) {
            if (b) break;
            Test.instanceCount += Integer.reverseBytes(--i4);
            if (b) {
                i4 *= Test.sFld;
                for (i7 = 1; i7 < 7; i7++) {
                    vMeth2(i8, -36696, b);
                    for (i15 = 1; i15 < 2; i15++) {
                        f1 += i6;
                        i8 += (i15 + Test.instanceCount);
                        i16 *= Test.sFld;
                    }
                    i8 <<= i6;
                    i17 += i8;
                }
                i4 = i17;
                Test.instanceCount = i17;
            } else {
                f1 += ((long)i5 | (long)i4);
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + i15 + i16 + Float.floatToIntBits(f1) + i17;
    }

    public void vMeth(int i3) {


        Test.sFld = (short)57718;
        i3 = i3;
        vMeth1(-8);
        fFld = Test.instanceCount;
        vMeth_check_sum += i3;
    }

    public void mainTest(String[] strArr1) {

        int i=189, i1=-14, i2=14267, i18=-126, i19=84, i20=49, i21=39, i22=142, i23=102, i24=9, iArr[][]=new int[N][N];
        byte by=-62;
        double d=125.102028;
        boolean b2=false;
        short sArr[]=new short[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(sArr, (short)-1222);
        FuzzerUtils.init(fArr1, 80.1F);
        FuzzerUtils.init(iArr, 5);

        i -= (++i);
        for (i1 = 6; 134 > i1; ++i1) {
            vMeth(i2);
            for (i18 = 196; i18 > 1; --i18) {
                i = i1;
                i19 &= i19;
                i19 |= i18;
                by += (byte)-240L;
            }
            i19 += i1;
            Test.instanceCount += (long)fFld;
            sArr[i1] = (short)Test.instanceCount;
            Test.instanceCount = by;
        }
        i = i18;
        i20 = 1;
        while ((i20 += 3) < 356) {
            fFld += 73.478F;
            for (i21 = 2; i21 < 212; i21++) {
                i >>>= i18;
                i = i20;
                fArr1[i21] = (float)d;
                for (i23 = 2; i23 > 1; --i23) {
                    iArr = FuzzerUtils.int2array(N, (int)-44578);
                    i19 = (int)Test.instanceCount;
                    Test.instanceCount >>>= -56967;
                    b2 = true;
                    Test.lArrFld[i20 + 1] -= Test.instanceCount;
                }
                i24 <<= (int)Test.instanceCount;
                i22 |= by;
                i2 >>>= i24;
            }
            i24 += (int)(61.48F + (i20 * i20));
            d = i21;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
