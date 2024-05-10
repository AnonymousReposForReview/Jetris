package tests.javafuzzer2209;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:22:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8440042850381878805L;
    public static volatile float fFld=1.49F;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.50517);
        FuzzerUtils.init(Test.iArrFld, -24);
        FuzzerUtils.init(Test.lArrFld, -253L);
    }

    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=1, i5=2, i6=-32713, i7=-18106, i8=-2, i9=11, i10=88, i11=-81, iArr2[]=new int[N];
        float f=-62.775F, fArr[]=new float[N];
        byte by1=-105;

        FuzzerUtils.init(fArr, -56.51F);
        FuzzerUtils.init(iArr2, -176);

        i4 = (int)f;
        for (i5 = 8; i5 < 380; ++i5) {
            i6 = i4;
        }
        for (i7 = 9; 146 > i7; ++i7) {
            fArr = fArr;
            fArr[i7] += i9;
            f += (-115 + (i7 * i7));
            i9 = i5;
            for (i10 = 1; i10 < 11; ++i10) {
                iArr2[i10] = i4;
                i9 += (i10 + i9);
                Test.instanceCount *= Test.instanceCount;
            }
            Test.instanceCount &= i6;
        }
        Test.instanceCount += Test.instanceCount;
        Test.instanceCount /= (by1 | 1);
        vMeth_check_sum += i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth() {

        int i2=-5, i3=4, i12=-106, i13=0, i14=-194, i15=14, i16=105, iArr1[]=new int[N];
        float f1=-1.266F;
        short s=-14870;

        FuzzerUtils.init(iArr1, -140);

        i2 = 1;
        do {
            Test.instanceCount += i2;
            iArr1[i2 + 1] <<= -24405;
            Test.instanceCount = (--i3);
            vMeth();
        } while (++i2 < 212);
        for (i12 = 5; 319 > i12; ++i12) {
            f1 *= Test.instanceCount;
            f1 += i13;
            switch (((i13 >>> 1) % 2) + 115) {
            case 115:
                for (i14 = 1; i14 < 5; i14++) {
                    i16 = 1;
                    while (++i16 < 2) {
                        f1 = 248;
                    }
                    Test.instanceCount += i14;
                    Test.instanceCount *= (long)f1;
                    s -= (short)-8;
                }
                break;
            case 116:
                i15 = (int)26195L;
                break;
            }
        }
        long meth_res = i2 + i3 + i12 + i13 + Float.floatToIntBits(f1) + i14 + i15 + i16 + s +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static short sMeth() {

        byte by=-74;
        int i1=29717, i17=-39345, i18=-176, i19=-27341, i20=-10, iArr[][]=new int[N][N];
        short s1=-14741;
        float f2=124.193F;
        boolean b2=true;
        double d=-33.125669;

        FuzzerUtils.init(iArr, -10);

        by += (byte)(++i1);
        i1 >>= iArr[(i1 >>> 1) % N][(i1 >>> 1) % N];
        i1 <<= (--iArr[(i1 >>> 1) % N][(i1 >>> 1) % N]);
        lMeth();
        switch (((i1 >>> 1) % 7) + 2) {
        case 2:
            i1 = (int)-889322503L;
            i1 = (int)7363042358410505293L;
            i1 -= s1;
            i17 = 1;
            while (++i17 < 306) {
                boolean b1=false;
                b1 = b1;
                for (f2 = i17; f2 < 5; ++f2) {
                    for (i19 = 1; i19 < 1; ++i19) {
                        i1 >>= i19;
                        Test.instanceCount = i1;
                        iArr[(int)(f2 + 1)][i19] = (int)Test.instanceCount;
                    }
                }
            }
            break;
        case 3:
            Test.instanceCount -= i18;
            break;
        case 4:
            i20 += i18;
            break;
        case 5:
            b2 = false;
            break;
        case 6:
            i1 -= i18;
        case 7:
            d += i1;
            break;
        case 8:
            i1 = -5963;
            break;
        }
        long meth_res = by + i1 + s1 + i17 + Float.floatToIntBits(f2) + i18 + i19 + i20 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        boolean b=true;
        int i=48045, i21=3, i22=14, i23=67, i24=-12845, i25=65407, i26=135, i27=47514, i28=5, i29=-11, i30=-42448,
            i31=53884;

        b = b;
        i = (int)(sMeth() + Test.instanceCount);
        for (i21 = 4; i21 < 169; ++i21) {
            if (b) {
                if (b) break;
                if (b) {
                    i22 = i23;
                    for (i24 = 152; i24 > 4; --i24) {
                        i23 += -21784;
                    }
                    Test.instanceCount += i25;
                    Test.dArrFld[i21 + 1] -= 0.589F;
                }
                Test.iArrFld[i21 - 1] = i;
            } else if (b) {
                Test.iArrFld[i21] *= i;
                i22 = (int)Test.instanceCount;
                Test.lArrFld[i21 - 1] += Test.instanceCount;
                i -= (int)Test.fFld;
            }
        }
        for (i26 = 19; i26 < 381; ++i26) {
            i25 = i24;
            for (i28 = 1; i28 < 70; ++i28) {
                i22 = -112;
                for (i30 = 2; i30 > 1; --i30) {
                    Test.iArrFld[i30 + 1] += -33630;
                    i23 /= (int)(i21 | 1);
                    Test.dArrFld[i30 + 1] = -6;
                    i22 -= i30;
                    i29 += (-5579 + (i30 * i30));
                    Test.instanceCount -= i28;
                    if (b) continue;
                    i27 += (((i30 * i28) + i31) - Test.instanceCount);
                }
                i27 += i28;
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
//DEBUG  lMeth ->  lMeth sMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}