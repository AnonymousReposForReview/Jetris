package tests.javafuzzer1788;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public static boolean bFld=true;
    public static short sFld=16929;
    public int iFld=-166;
    public byte byFld=-42;
    public float fFld=0.592F;
    public static boolean bFld1=false;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2297700567L);
        FuzzerUtils.init(Test.iArrFld, 113);
        FuzzerUtils.init(Test.byArrFld, (byte)9);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(float f1) {

        int i3=-220, i4=2, i5=15739, i6=2, i7=110, i8=-57296;
        byte by=76;
        float f2=88.745F, fArr[]=new float[N];
        long l=-28114L;

        FuzzerUtils.init(fArr, -2.412F);

        for (i3 = 13; i3 < 252; i3++) {
            i4 += by;
            Test.iArrFld[i3] -= -2988;
            switch (((i3 % 7) * 5) + 5) {
            case 17:
                i5 = 1;
                do {
                    Test.instanceCount += (i5 | i4);
                    if (Test.bFld) break;
                    for (f2 = 1; f2 < 1; ++f2) {
                        i6 += (int)((long)f2 | Test.instanceCount);
                        i4 = 12;
                        i6 += (int)Test.instanceCount;
                        i6 = i5;
                        i7 -= (int)Test.instanceCount;
                    }
                    i7 <<= 7;
                    i8 += (i5 * i5);
                } while (++i5 < 7);
                break;
            case 36:
                i6 = 5;
                break;
            case 13:
                fArr[i3] -= (float)-2.7189;
                break;
            case 27:
                Test.iArrFld[i3] -= i3;
            case 20:
                Test.lArrFld[i3] += i4;
                break;
            case 28:
                Test.byArrFld[i3 + 1] /= (byte)(i8 | 1);
                break;
            case 9:
                i6 = (int)l;
                break;
            default:
                i8 = (int)-1826930727075820578L;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i3 + i4 + by + i5 + Float.floatToIntBits(f2) + i6 + i7 + i8 + l +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static int iMeth(int i2, float f) {

        int i9=28079, i10=-25313, i11=-150, i12=126, i13=14, i14=47485, iArr[]=new int[N];
        byte by1=-88;
        float fArr1[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(fArr1, 0.195F);
        FuzzerUtils.init(sArr, (short)-8191);

        i2 &= (Math.abs((int)(i2 % (Test.instanceCount | 1))) + i2);
        iArr[(i2 >>> 1) % N] = Math.max(Math.max(iArr[(197 >>> 1) % N]--, 130), iArr[(i2 >>> 1) % N]);
        f = ((iArr[(162 >>> 1) % N]--) - (byMeth(f) * i2));
        for (i9 = 10; 320 > i9; ++i9) {
            Test.instanceCount &= i2;
            i2 = (int)Test.instanceCount;
            i2 >>= -55;
            i10 -= (int)-5412785425179301195L;
            Test.sFld += (short)(-11 + (i9 * i9));
            fArr1[i9 + 1] += -7;
            for (i11 = i9; i11 < 5; i11++) {
                for (i13 = 1; i13 > i11; i13--) {
                    sArr[i11] = (short)114.88000;
                    i14 *= 9;
                    by1 += (byte)-274;
                }
            }
        }
        long meth_res = i2 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i13 + i14 + by1 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=10642, i15=-30, i16=47642, i17=220, i18=-8, i19=157, i20=7;
        double d1=2.44050;
        float f3=-110.624F, fArr2[]=new float[N];
        byte by2=99, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)35);
        FuzzerUtils.init(fArr2, 1.386F);

        Test.lArrFld[(7 >>> 1) % N] *= Test.lArrFld[(i1 >>> 1) % N];
        i1 ^= (int)(byArr[(i1 >>> 1) % N] - (iMeth(112, 32.13F) - Test.instanceCount));
        for (i15 = 13; i15 < 212; ++i15) {
            Test.iArrFld[i15 - 1] >>>= i15;
            i1 -= i1;
        }
        for (i17 = 6; i17 < 159; i17++) {
            if (Test.bFld) continue;
            d1 *= -2.50469;
            i19 = 1;
            do {
                f3 *= i16;
                switch (((i19 >>> 1) % 7) + 105) {
                case 105:
                    i20 = 1;
                    while (++i20 < 1) {
                        i16 = i1;
                    }
                    Test.iArrFld[i17] += i20;
                    Test.instanceCount -= by2;
                case 106:
                    fArr2[(i1 >>> 1) % N] -= 6L;
                    break;
                case 107:
                    i16 >>= i17;
                case 108:
                case 109:
                    Test.instanceCount *= i20;
                    break;
                case 110:
                    i16 += i19;
                case 111:
                    by2 += (byte)i19;
                    break;
                default:
                    i16 <<= (int)Test.instanceCount;
                }
            } while (++i19 < 10);
        }
        vMeth_check_sum += i1 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d1) + i19 + Float.floatToIntBits(f3) +
            i20 + by2 + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i22=-61368, i23=-70, i24=14946, i25=15896, i26=14698, i27=13, i28=4431, i29=207, i30=-3;
        double d=1.101219;
        float fArr3[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr3, 2.27F);
        FuzzerUtils.init(bArr, true);

        i = 1;
        while (++i < 249) {
            int i21=-41;
            Test.lArrFld[i] -= (long)Math.sqrt(--d);
            vMeth();
            i21 <<= -58617;
            Test.instanceCount *= 59745;
        }
        i22 = 1;
        do {
            i23 = 1;
            do {
                iFld += i23;
                Test.instanceCount = i;
                iFld += (((i23 * Test.sFld) + i23) - iFld);
                iFld -= (int)-6928L;
                iFld >>= i22;
                iFld <<= i23;
            } while ((i23 += 3) < 81);
            for (i24 = 4; i24 < 81; ++i24) {
                for (i26 = 1; i26 < 2; ++i26) {
                    Test.byArrFld[i26 - 1] -= (byte)2952;
                    byFld += (byte)Test.instanceCount;
                    d += fFld;
                }
                fFld = -12296;
                Test.instanceCount += (i24 + i24);
                iFld += i26;
                fArr3[i24] = i26;
                switch (((i22 % 4) * 5) + 24) {
                case 30:
                    i25 += (((i24 * i28) + i28) - i27);
                    i28 += i24;
                    Test.lArrFld[i24 + 1] /= (Test.instanceCount | 1);
                    break;
                case 34:
                    for (i29 = 1; 2 > i29; ++i29) {
                        Test.instanceCount <<= iFld;
                        Test.iArrFld[i22] = i26;
                        Test.iArrFld[i22 - 1] = i26;
                    }
                    break;
                case 41:
                    fFld = i30;
                    break;
                case 27:
                    bArr[i22 + 1] = Test.bFld1;
                    break;
                default:
                    iFld = (int)Test.instanceCount;
                }
            }
        } while (++i22 < 312);



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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  byMeth ->  byMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
