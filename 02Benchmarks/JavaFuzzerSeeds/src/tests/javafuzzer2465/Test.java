package tests.javafuzzer2465;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 15:01:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=814L;
    public static float fFld=-2.872F;
    public static double dFld=2.130220;
    public static volatile byte byFld=61;
    public boolean bFld=true;
    public static long lFld=-3L;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 1.867F);
        FuzzerUtils.init(Test.iArrFld, 220);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, int i4) {

        int i5=-29572, i6=7, i7=6, i8=33, i9=977, i10=-108;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 235L);

        Test.dFld -= i4;
        for (i5 = 257; i5 > 3; --i5) {
            for (i7 = i5; i7 < 6; i7++) {
                short s=-30184;
                s = (short)Test.instanceCount;
                for (i9 = 1; 1 > i9; ++i9) {
                    byte by=-28;
                    i6 += i9;
                    i10 = i9;
                    Test.fFld = i10;
                    lArr[i7 - 1] *= 29934;
                    if (b) {
                        i8 -= (int)Test.fFld;
                    } else if (b) {
                        Test.fArrFld = FuzzerUtils.float1array(N, (float)0.330F);
                        by >>= (byte)i3;
                        Test.fFld += (-67 + (i9 * i9));
                        i3 = i9;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        double d1=1.91006, dArr[]=new double[N];
        int i11=-7, i12=-49409, i13=137, i14=225, i15=32107, i16=12, i17=181;
        boolean b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 369133222L);
        FuzzerUtils.init(dArr, -2.24950);

        d1 -= iMeth(i11, i11);
        i12 = 1;
        do {
            switch ((((i12 >>> 1) % 1) * 5) + 93) {
            case 94:
                Test.instanceCount += Test.instanceCount;
                i13 = 1;
                while (++i13 < 5) {
                    Test.instanceCount &= i12;
                    Test.byFld >>= (byte)i12;
                }
            default:
                i11 /= (int)(i11 | 1);
            }
            for (i14 = 5; i14 > 1; i14 -= 2) {
                lArr1[i12 + 1] = i15;
                for (i16 = i12; 3 > i16; ++i16) {
                    i17 >>>= i15;
                    if (b1) continue;
                    dArr[i14] -= 22005;
                    i15 <<= 6;
                }
            }
        } while (++i12 < 325);
        long meth_res = Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14 + i15 + i16 + i17 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i1=250, i2=-220, i19=-701, i20=-41604, i21=13, i22=-20928, i23=-225, iArr[]=new int[N];
        boolean b2=true;
        float f=-2.889F;

        FuzzerUtils.init(iArr, 13);

        i1 = 1;
        do {
            if (b2) {
                i2 += (int)(i1 - ((57775 * (Test.instanceCount >> Test.instanceCount)) - (Test.fFld *
                    Test.instanceCount)));
                Test.fFld -= lMeth();
                Test.instanceCount -= i1;
            }
            for (i19 = i1; i19 < 7; i19++) {
                Test.instanceCount *= i19;
                Test.fFld = Test.instanceCount;
                Test.instanceCount = (long)Test.fFld;
            }
        } while (++i1 < 244);
        for (f = 10; f < 163; f++) {
            if (i1 != 0) {
                vMeth_check_sum += i1 + i2 + (b2 ? 1 : 0) + i19 + i20 + Float.floatToIntBits(f) + i21 + i22 + i23 +
                    FuzzerUtils.checkSum(iArr);
                return;
            }
            for (i22 = 1; i22 < 10; ++i22) {
                i23 += (int)Test.instanceCount;
                b2 = b2;
                iArr[(int)(f)] -= (int)Test.instanceCount;
            }
        }
        vMeth_check_sum += i1 + i2 + (b2 ? 1 : 0) + i19 + i20 + Float.floatToIntBits(f) + i21 + i22 + i23 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        double d=1.122109;
        int i=139, i24=160, i25=241, i26=203, i27=86, i28=0, i29=-49030, i30=63152, i31=8233;
        short s1=-16971;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 4176590790L);

        for (d = 11; d < 312; ++d) {
            vMeth();
            Test.instanceCount += 18586;
            Test.instanceCount += (long)d;
            i += (int)Test.instanceCount;
            i = (int)1.17137;
            for (i24 = 1; i24 < 84; ++i24) {
                switch (((i >>> 1) % 2) + 112) {
                case 112:
                case 113:
                    i25 += (i24 - Test.instanceCount);
                    break;
                default:
                    for (i26 = 2; i26 > 1; --i26) {
                        Test.dFld = -10;
                        i += i;
                        Test.iArrFld[i26] += i24;
                        Test.fFld += Test.byFld;
                        Test.dFld += 70;
                        s1 -= (short)Test.fFld;
                        Test.iArrFld[i24] *= (int)Test.fFld;
                        if (false) continue;
                    }
                    Test.iArrFld[(i27 >>> 1) % N] = i;
                    for (i28 = 2; i28 > 1; i28 -= 2) {
                        i27 += i28;
                        Test.instanceCount += i24;
                        Test.iArrFld[i24 + 1] += (int)Test.fFld;
                        i27 += (i28 * i28);
                        Test.fFld += (((i28 * Test.instanceCount) + i29) - Test.fFld);
                    }
                    Test.byFld >>= (byte)88;
                }
                switch ((int)((d % 10) + 41)) {
                case 41:
                    for (i30 = (int)(d); i30 < 2; ++i30) {
                        bFld = bFld;
                        i27 = i29;
                    }
                    break;
                case 42:
                    i27 = (int)1181418253L;
                    break;
                case 43:
                    i >>= i28;
                case 44:
                    i = -30;
                    break;
                case 45:
                    Test.dFld = Test.byFld;
                case 46:
                    i25 <<= i27;
                case 47:
                    Test.lFld -= 8;
                    break;
                case 48:
                    i29 >>= s1;
                    break;
                case 49:
                    lArr2[i24] += i27;
                    break;
                case 50:
                    i25 = i31;
                    break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
