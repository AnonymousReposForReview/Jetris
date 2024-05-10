package tests.javafuzzer196;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:54:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=57959L;
    public float fFld=0.136F;
    public long lFld=-35L;
    public static boolean bFld=false;
    public static int iFld=-43560;
    public byte byFld=-21;
    public static short sFld=-2084;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2(int i8, int i9, int i10) {

        int i11=-38598, i12=-47794, i13=0, i14=-84, i15=-12, i16=28702, iArr1[]=new int[N];
        short s=6008;
        double d1=0.45934;
        boolean b=true, bArr[]=new boolean[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 92);
        FuzzerUtils.init(byArr, (byte)95);
        FuzzerUtils.init(bArr, true);

        for (i11 = 4; i11 < 356; i11++) {
            i8 >>>= i10;
            iArr1[i11] >>= i8;
            s = (short)i9;
            i8 -= 12;
        }
        for (i13 = 1; 126 > i13; i13++) {
            iArr1[i13] = (int)lFld;
            i12 <<= i10;
        }
        for (d1 = 6; d1 < 286; ++d1) {
            i12 += (int)d1;
        }
        i12 = 158;
        Test.instanceCount = (long)2.89F;
        byArr[(i16 >>> 1) % N] = (byte)i16;
        bArr[(i16 >>> 1) % N] = b;
        i12 = (int)lFld;
        vMeth2_check_sum += i8 + i9 + i10 + i11 + i12 + s + i13 + i14 + Double.doubleToLongBits(d1) + i15 + i16 + (b ?
            1 : 0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth1() {

        int i3=-4, i4=-4, i5=-7, i6=33761, i7=-221;
        double d=2.91045;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -174L);

        for (i3 = 6; i3 < 199; i3++) {
            Test.instanceCount += (((i3 * i4) + i4) - fFld);
            i4 = i3;
            i5 = 1;
            while (++i5 < 8) {
                if (Test.bFld) {
                    i4 >>>= (int)Test.instanceCount;
                    d -= (((--i4) + lArr[i5][i3]) * lArr[i3 + 1][i5 + 1]);
                    for (i6 = 1; i6 < 1; i6 += 3) {
                        try {
                            i4 = (1263798569 % i5);
                            i4 = (i6 / i4);
                            i7 = (i7 % i6);
                        } catch (ArithmeticException a_e) {}
                        vMeth2(i7, 8, i4);
                        lFld >>= i3;
                    }
                    lFld = i7;
                }
                i7 += (i5 + i3);
                d -= d;
            }
            Test.instanceCount |= lFld;
        }
        vMeth1_check_sum += i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i1, int i2, long l1) {


        vMeth1();
        vMeth_check_sum += i1 + i2 + l1;
    }

    public void mainTest(String[] strArr1) {

        long l=56306L;
        int i=0, i17=197, i18=-9, i19=34342, i20=-6, i21=0, i22=-231, i23=209, i24=14, i25=22592, iArr[]=new int[N];
        double d3=2.130199, d4=-103.32713;
        float f=0.409F;

        FuzzerUtils.init(iArr, -229);

        for (l = 15; l < 287; ++l) {
            Test.instanceCount |= (-((++Test.instanceCount) >> iArr[(int)(l)]));
        }
        vMeth(i, i, l);
        for (i17 = 11; i17 < 287; ++i17) {
            double d2=25.75060;
            fFld += lFld;
            fFld -= (float)d2;
            i -= (int)8L;
        }
        i18 += (int)lFld;
        i19 = 1;
        while (++i19 < 304) {
            for (i20 = 83; 1 < i20; i20--) {
                i = i20;
                fFld += i20;
                Test.instanceCount = l;
                lFld -= (long)fFld;
            }
            i21 *= i17;
        }
        i *= (int)d3;
        d4 = 1;
        do {
            i22 = 94;
            while ((i22 -= 2) > 0) {
                i += (i22 * i22);
            }
            i21 += (int)(d4 * fFld);
            for (i23 = 94; i23 > 4; i23 -= 2) {
                Test.instanceCount += (((i23 * fFld) + i24) - Test.iFld);
                Test.bFld = false;
                byFld *= (byte)i20;
                for (f = 1; 3 > f; f++) {
                    i = -63094;
                    Test.sFld += (short)i18;
                    i25 += (int)(f + lFld);
                }
                lFld = lFld;
                i21 = -16633;
            }
        } while (++d4 < 268);


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