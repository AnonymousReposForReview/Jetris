package tests.javafuzzer168;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 23:13:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4L;
    public static byte byFld=115;
    public static int iFld=223;
    public static float fFld=-2.566F;

    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, int i5) {

        double d=0.101613, d1=-17.117885;
        short s=7421;
        int i6=-31725, i7=-51, i8=-10, i9=-60, i10=-46796, iArr[]=new int[N];
        boolean b=false;
        byte byArr[]=new byte[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(byArr, (byte)122);
        FuzzerUtils.init(fArr, -90.276F);
        FuzzerUtils.init(iArr, 5);

        i5 >>= Test.iFld;
        byArr[(Test.iFld >>> 1) % N] *= (byte)l;
        Test.instanceCount >>= i5;
        d = 1;
        while ((d += 3) < 282) {
            i5 >>= i5;
            Test.iFld += (int)d;
            Test.instanceCount = s;
            fArr[(int)(d - 1)] = l;
        }
        i6 = 1;
        do {
            for (i7 = i6; i7 < 12; i7++) {
                iArr[i7] -= (int)-12L;
                if (b) {
                    for (i9 = 1; i9 < 1; ++i9) {
                        Test.byFld = (byte)i6;
                        i8 >>= (int)9L;
                    }
                } else if (b) {
                    d1 += Test.instanceCount;
                }
            }
        } while (++i6 < 134);
        vMeth_check_sum += l + i5 + Double.doubleToLongBits(d) + s + i6 + i7 + i8 + i9 + i10 +
            Double.doubleToLongBits(d1) + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(float f, int i4) {

        int i11=2, i12=-238, i13=6, i14=-50686, i15=33365, i16=-4, i17=-10, i18=-10, iArr1[]=new int[N];
        short sArr[]=new short[N];
        float fArr1[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 13000);
        FuzzerUtils.init(sArr, (short)-14971);
        FuzzerUtils.init(fArr1, 105.625F);
        FuzzerUtils.init(lArr, -504302341L);

        vMeth(Test.instanceCount, i4);
        for (i11 = 12; i11 < 234; ++i11) {
            Test.instanceCount += i11;
            Test.iFld -= i4;
            iArr1[i11 + 1] >>= i11;
        }
        for (i13 = 10; i13 < 200; i13++) {
            sArr[i13 - 1] = (short)36450;
            for (i15 = 1; i15 < 8; i15++) {
                for (i17 = 1; i17 < 2; i17 += 2) {
                    fArr1[i17] = 179;
                    Test.iFld ^= i17;
                    Test.instanceCount += i17;
                    Test.instanceCount *= 0;
                    lArr[i13 + 1] = Test.instanceCount;
                    i4 *= (int)Test.instanceCount;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i4 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth() {

        double d2=-2.26869, d3=-26.115456;
        short s1=21966;
        int i20=-229, i21=33846, iArr2[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr2, -52937);

        Test.iFld = (int)((iMeth(Test.fFld, Test.iFld) + Test.iFld) - d2);
        Test.iFld = s1;
        for (int i19 : iArr2) {
            Test.byFld -= (byte)Test.iFld;
            d3 = 1;
            while (++d3 < 4) {
                i19 -= (int)Test.instanceCount;
                Test.iFld <<= Test.iFld;
                for (i20 = 1; i20 < 1; i20++) {
                    i21 += (int)Test.instanceCount;
                    if (b1) break;
                    Test.fFld -= i20;
                    Test.iFld += Test.iFld;
                    iArr2[(int)(d3 + 1)] *= i20;
                    iArr2[(int)(d3 - 1)] = i19;
                }
                i19 += (int)((long)d3 ^ (long)Test.fFld);
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + s1 + Double.doubleToLongBits(d3) + i20 + i21 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=8, i2=-6, i3=-3, i22=129, i23=62576, i24=-2, i25=-2, i26=-22, i27=-28458, i28=8009, i29=-13,
            iArr3[][]=new int[N][N];
        float f1=-1.199F;
        boolean b2=true;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr3, 5847);
        FuzzerUtils.init(lArr1, 4009513041347283037L);

        for (i = 19; i < 354; i++) {
            i2 += (i ^ i1);
            i3 = 1;
            do {
                Test.byFld = (byte)sMeth();
                i2 += (((i3 * i2) + i) - i2);
                i2 -= Test.iFld;
                iArr3[i + 1][i - 1] >>= i3;
                i2 += (i3 - Test.fFld);
            } while (++i3 < 75);
            i22 = 1;
            while (++i22 < 75) {
                Test.instanceCount -= i22;
                for (f1 = 1; f1 < 1; f1++) {
                    Test.iFld += -40;
                }
                Test.iFld >>= i;
                Test.fFld = i23;
                lArr1 = lArr1;
                Test.iFld = i23;
            }
            Test.iFld = i;
            for (i24 = i; i24 < 75; ++i24) {
                for (i26 = 1; i26 < 1; ++i26) {
                    Test.instanceCount += (-119 + (i26 * i26));
                    Test.iFld = i;
                }
                b2 = b2;
                for (i28 = 1; i28 < 1; ++i28) {
                    i25 = i28;
                    i23 += (((i28 * Test.iFld) + i29) - Test.instanceCount);
                    switch ((i % 6) + 108) {
                    case 108:
                        Test.instanceCount *= Test.instanceCount;
                        break;
                    case 109:
                        i27 += (((i28 * i29) + i2) - i2);
                        lArr1[i28 + 1][i28 - 1] = Test.iFld;
                        i23 = i23;
                        break;
                    case 110:
                        i29 = i;
                        break;
                    case 111:
                        iArr3[i + 1][i - 1] *= i25;
                        break;
                    case 112:
                        Test.iFld += (i28 - i27);
                        break;
                    case 113:
                        i29 += i3;
                        break;
                    }
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
//DEBUG  iMeth ->  iMeth sMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
