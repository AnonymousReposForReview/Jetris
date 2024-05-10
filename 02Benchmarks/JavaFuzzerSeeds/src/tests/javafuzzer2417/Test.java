package tests.javafuzzer2417;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:22:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=30L;
    public static boolean bFld=true;
    public static byte byFld=48;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 212);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, boolean b, long l2) {

        float f=-2.661F, f2=0.993F;
        int i5=-33746, i6=50382, i7=1, i8=-50464, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 0);

        iArr[(-196 >>> 1) % N] -= (int)l2;
        for (f = 2; f < 150; ++f) {
            float f1=1.342F;
            try {
                i5 = (i5 % i5);
                i4 = (iArr[(int)(f)] / iArr[(int)(f)]);
                i4 = (i4 % -56383);
            } catch (ArithmeticException a_e) {}
            i4 *= i4;
            i4 >>= i4;
            l2 -= i5;
            f1 = i5;
            i4 = i4;
        }
        l2 *= i5;
        for (i6 = 15; i6 < 328; ++i6) {
            i8 = 1;
            while (++i8 < 5) {
                b = b;
                if (b) continue;
                i5 *= i7;
                f2 = f2;
            }
        }
        long meth_res = i4 + (b ? 1 : 0) + l2 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + Float.floatToIntBits(f2)
            + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static float fMeth() {

        int i1=-206, i2=-53, i3=-171, i9=-2, i10=27457, i11=3;
        float f3=-61.381F;

        i1 += i1;
        for (i2 = 7; i2 < 209; i2++) {
            iMeth(i1, Test.bFld, Test.instanceCount);
            Test.instanceCount -= i2;
            i3 ^= i2;
            if (Test.bFld) break;
            i3 -= i2;
            i9 = 1;
            while (++i9 < 8) {
                for (i10 = 1; i10 < 1; ++i10) {
                    Test.instanceCount >>= i1;
                    Test.bFld = Test.bFld;
                    f3 += (float)-2.53880;
                    Test.instanceCount -= Test.instanceCount;
                    f3 = i9;
                    if (true) continue;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i9 + i10 + i11 + Float.floatToIntBits(f3);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i, long l, long l1) {

        float f4=99.797F;
        int i12=59, i13=9, i14=-11, i15=5, i16=1, i17=22127;
        double d=127.34718;

        if (Test.bFld) {
            Test.instanceCount >>= (long)(fMeth() - i);
            f4 += (float)2.17330;
            vMeth_check_sum += i + l + l1 + Float.floatToIntBits(f4) + i12 + i13 + Double.doubleToLongBits(d) + i14 +
                i15 + i16 + i17;
            return;
        } else if (Test.bFld) {
            for (i12 = 5; i12 < 295; ++i12) {
                Test.iArrFld[i12 - 1] -= (int)28.833F;
                Test.iArrFld[i12 + 1] = (int)d;
                i13 <<= i13;
                for (i14 = 6; i14 > 1; i14--) {
                    f4 = l1;
                    for (i16 = i14; 2 > i16; i16++) {
                        i15 -= -10160;
                        i13 += (int)-8L;
                        Test.iArrFld[i16] = i17;
                        i15 *= (int)l1;
                        Test.instanceCount = i12;
                    }
                }
            }
        }
        vMeth_check_sum += i + l + l1 + Float.floatToIntBits(f4) + i12 + i13 + Double.doubleToLongBits(d) + i14 + i15 +
            i16 + i17;
    }

    public void mainTest(String[] strArr1) {

        int i18=56783, i19=20956, i20=-42, i21=-37882, i22=-14, i23=-140, i24=-2, i25=-4, i26=-11, i27=0, i28=10456,
            i29=10;
        float f5=31.690F, f6=2.958F;
        double d1=54.37679;

        vMeth(i18, Test.instanceCount, Test.instanceCount);
        i18 = i18;
        for (i19 = 15; 355 > i19; i19++) {
            i20 -= i19;
        }
        if (Test.bFld) {
            for (i21 = 6; i21 < 169; i21 += 3) {
                switch (((i21 % 3) * 5) + 55) {
                case 70:
                    i18 *= -19;
                    switch ((i21 % 3) + 118) {
                    case 118:
                        for (i23 = 1; i23 < i21; i23++) {
                            f5 += -47575;
                            i24 <<= i24;
                            Test.byFld -= (byte)Test.instanceCount;
                            i20 -= (int)d1;
                            d1 -= i19;
                            f5 -= i21;
                            Test.instanceCount = (long)f5;
                        }
                        if (Test.bFld) {
                            for (i25 = 8; i25 < 345; i25++) {
                                i26 += (int)(59090L + (i25 * i25));
                            }
                        } else if (Test.bFld) {
                            Test.instanceCount += Test.instanceCount;
                            switch (((i21 % 2) * 5) + 22) {
                            case 24:
                                i20 = i19;
                                for (f6 = 11; 261 > f6; ++f6) {
                                    i22 += (int)Test.instanceCount;
                                    for (i28 = 1; i28 < 2; ++i28) {
                                        Test.instanceCount = -5;
                                        Test.iArrFld[i21 - 1] *= (int)-36001L;
                                    }
                                }
                                break;
                            case 29:
                                i18 = i22;
                                break;
                            default:
                                Test.instanceCount += (-22 + (i21 * i21));
                            }
                        }
                        break;
                    case 119:
                        Test.instanceCount = 35392L;
                    case 120:
                        i27 >>>= i22;
                        break;
                    default:
                        i26 = i21;
                    }
                case 56:
                    i29 = (int)Test.instanceCount;
                    break;
                case 69:
                    f5 *= i21;
                    break;
                default:
                    Test.instanceCount = i22;
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}