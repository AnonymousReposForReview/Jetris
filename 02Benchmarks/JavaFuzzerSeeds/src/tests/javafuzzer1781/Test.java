package tests.javafuzzer1781;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public static byte byFld=101;
    public static short sFld=-17717;
    public static float fFld=-1.542F;
    public float fFld1=-79.646F;
    public static boolean bFld=true;
    public byte byArrFld[]=new byte[N];

    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l) {

        int i3=-212, i4=6095, i5=-15, i6=56966;
        float f1=-79.626F, fArr[]=new float[N];
        double d=49.53486;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)50);
        FuzzerUtils.init(fArr, 81.614F);

        l = i3;
        Test.byFld -= (byte)l;
        i3 ^= Test.sFld;
        Test.instanceCount = i3;
        l -= (long)f1;
        for (byte by1 : byArr) {
            Test.instanceCount >>= l;
            for (i4 = 1; 4 > i4; ++i4) {
                fArr[i4] = l;
                i3 -= 17474;
            }
            switch (((i5 >>> 1) % 4) + 62) {
            case 62:
                i6 = 1;
                do {
                    Test.instanceCount -= Test.sFld;
                    d -= f1;
                    i5 = (int)l;
                } while (++i6 < 4);
            case 63:
            case 64:
                i5 <<= i4;
                break;
            case 65:
                if (b) continue;
                break;
            }
        }
        long meth_res = l + i3 + Float.floatToIntBits(f1) + i4 + i5 + i6 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(float f, int i2) {

        int i7=-3, i8=7, i9=13190, i10=-8, i11=6, i12=180, i13=-14, iArr[]=new int[N];
        double d1=88.26675;

        FuzzerUtils.init(iArr, -102);

        i2 = iMeth1(Test.instanceCount);
        for (i7 = 303; i7 > 12; i7--) {
            try {
                iArr[i7] = (iArr[i7 - 1] % 11853);
                i2 = (119 / i7);
                i2 = (i7 / i2);
            } catch (ArithmeticException a_e) {}
        }
        Test.instanceCount -= i7;
        for (i9 = 10; i9 < 303; ++i9) {
            Test.byFld -= (byte)i10;
            d1 -= f;
            for (i11 = 1; i11 < 6; ++i11) {
                i13 = 1;
                do {
                    f -= 6388L;
                    i2 += (int)(2487329304L + (i13 * i13));
                    Test.byFld = (byte)i12;
                    i2 += (((i13 * i12) + i9) - i13);
                    d1 -= i11;
                    Test.byFld *= (byte)i11;
                } while (++i13 < 2);
            }
        }
        long meth_res = Float.floatToIntBits(f) + i2 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 +
            i13 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth() {

        int i1=-42583, i14=-13, i15=203, i16=-9, i17=50359, i18=-220, i19=966, i20=35787, iArr1[][]=new int[N][N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -6501383685109975733L);
        FuzzerUtils.init(iArr1, 176);

        lArr[(i1 >>> 1) % N][(i1 >>> 1) % N] += (-(sMeth(Test.fFld, i1) - i1));
        for (i14 = 1; i14 < 167; ++i14) {
            for (i16 = 1; i16 < 10; i16++) {
                i1 -= i16;
                Test.instanceCount = i1;
                switch (((i14 % 2) * 5) + 108) {
                case 111:
                    iArr1[i14 - 1][i14 + 1] = (int)Test.fFld;
                    Test.instanceCount = i16;
                    Test.sFld = (short)i18;
                    break;
                case 115:
                    Test.instanceCount += i16;
                    for (i19 = 2; i19 > 1; --i19) {
                        Test.instanceCount -= i19;
                        Test.instanceCount += i19;
                        Test.fFld -= -13L;
                        i18 ^= i18;
                    }
                    break;
                }
            }
        }
        long meth_res = i1 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=71, byArr1[]=new byte[N];
        int i=-10, i22=-190, i23=144, i24=10, i25=-176, i26=-28110, iArr2[]=new int[N];
        long lArr1[]=new long[N];
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(iArr2, -10);
        FuzzerUtils.init(lArr1, 2594442716L);
        FuzzerUtils.init(fArr1, -29.322F);
        FuzzerUtils.init(byArr1, (byte)72);

        by >>= (byte)(((i + i) >> Math.abs(i)) * iMeth());
        by = (byte)Test.instanceCount;
        if (Test.bFld) {
            Test.instanceCount %= (i | 1);
            Test.fFld *= fFld1;
            i -= 24956;
            i >>= (int)Test.instanceCount;
        } else {
            for (byte by2 : byArrFld) {
                i = i;
            }
        }
        Test.fFld = i;
        iArr2 = iArr2;
        i22 = 1;
        do {
            lArr1[i22] = Test.instanceCount;
            for (i23 = 174; i23 > 4; --i23) {
                i24 &= -13221;
                i *= (int)Test.instanceCount;
                if (Test.bFld) break;
                switch ((i23 % 2) + 79) {
                case 79:
                    Test.instanceCount /= (Test.instanceCount | 1);
                    i24 = -22734;
                    for (i25 = 1; i25 < 2; ++i25) {
                        iArr2[i25] >>= i25;
                        i24 = Test.sFld;
                        i += i25;
                        i24 += (i25 | i26);
                        fArr1[i23][i22] += i;
                    }
                    byArr1[i23 - 1] -= (byte)i22;
                    break;
                case 80:
                    Test.fFld = i24;
                    break;
                }
            }
            by += (byte)(i22 + i24);
            i24 -= (int)31.572F;
        } while (++i22 < 144);


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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
