package tests.javafuzzer73;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:49:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7918319275727700660L;
    public static double dFld=2.69196;
    public static byte byFld=-119;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.iArrFld, 60942);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i10=84, i11=90, i12=64, i13=-2, i14=-5, i15=-29356, i16=-43, i17=249, iArr2[]=new int[N];
        double d=-52.63277;
        short s1=12973;

        FuzzerUtils.init(iArr2, -4);

        i10 = 1;
        do {
            i11 -= (int)d;
            for (i12 = 1; 4 > i12; i12++) {
                i11 += s1;
                i13 += (int)d;
            }
            for (i14 = 1; i14 < 4; i14++) {
                i11 += -77;
                Test.instanceCount = Test.instanceCount;
                d %= (Test.instanceCount | 1);
                for (i16 = 1; i16 < 2; ++i16) {
                    float f2=31.535F;
                    if (i14 != 0) {
                        vMeth_check_sum += i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 + s1 + i14 + i15 + i16 +
                            i17 + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                    Test.bArrFld[i16 + 1] = true;
                    i17 += (int)(-7L + (i16 * i16));
                    f2 = -5162797273075688689L;
                    iArr2 = iArr2;
                }
            }
        } while (++i10 < 397);
        vMeth_check_sum += i10 + i11 + Double.doubleToLongBits(d) + i12 + i13 + s1 + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static long lMeth(float f, int i7, int i8) {

        float f1=-50.618F, f3=0.711F, fArr[]=new float[N];
        int i9=0, i18=-1, i19=-39699, i20=-46, i21=103, i22=-10;
        short s2=-11585;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 76.62985);
        FuzzerUtils.init(fArr, 33.43F);

        i8 = (Math.max((int)(-61992L - dArr[(i7 >>> 1) % N]), (int)(i7 * f)) * -29198);
        for (f1 = 352; f1 > 17; --f1) {
            vMeth();
            for (f3 = 1; 5 > f3; f3++) {
                fArr[(int)(f1 + 1)] += Test.instanceCount;
                i18 += (int)(f3 - i18);
                fArr[(int)(f3 - 1)] = 1022386908L;
                s2 -= (short)-12;
                i7 *= i9;
                for (i19 = 2; 1 < i19; i19 -= 2) {
                    i21 <<= i8;
                }
                i22 += (int)(f3 + Test.instanceCount);
                Test.iArrFld[(int)(f1)][(int)(f3)] *= i18;
                i22 -= (int)Test.instanceCount;
            }
            i22 += (int)(((f1 * Test.instanceCount) + Test.instanceCount) - i18);
        }
        long meth_res = Float.floatToIntBits(f) + i7 + i8 + Float.floatToIntBits(f1) + i9 + Float.floatToIntBits(f3) +
            i18 + s2 + i19 + i20 + i21 + i22 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(long l) {

        int i1=-11, i2=38459, i3=-23, i4=-217, i5=56553, i6=-38279, iArr1[]=new int[N];
        short s=10046;
        float f4=1.153F;

        FuzzerUtils.init(iArr1, -30492);

        for (i1 = 2; i1 < 163; ++i1) {
            l -= (((l * s) - (-(-5662574348129207624L - (l - i1)))) + i2);
            for (i3 = 1; 10 > i3; i3++) {
                for (i5 = i1; i5 < 2; ++i5) {
                    i4 -= (int)-18.2278;
                    try {
                        iArr1[i1] = (i5 / -8);
                        i2 = (i1 % i3);
                        i4 = (iArr1[i5] / -823169280);
                    } catch (ArithmeticException a_e) {}
                    s -= (short)(lMeth(f4, i5, i4) + i4);
                    Test.dFld += i5;
                    i6 = -57087;
                    i6 += -11;
                    i4 |= (int)l;
                }
                Test.iArrFld[i3][i3] = Test.byFld;
                Test.instanceCount = i2;
                s -= (short)i2;
                Test.instanceCount += (i3 * i3);
            }
        }
        long meth_res = l + i1 + i2 + s + i3 + i4 + i5 + i6 + Float.floatToIntBits(f4) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-201, i23=29, i24=-9756, i25=0, i26=18, i28=4, i29=12, iArr[]=new int[N];
        boolean b=false;
        float f5=6.203F;
        short s3=-17903;

        FuzzerUtils.init(iArr, 14);

        iArr[(i >>> 1) % N] -= Math.min((int)(iArr[(-22474 >>> 1) % N] * (Test.instanceCount = Test.instanceCount)),
            Math.min(iMeth(Test.instanceCount), i));
        for (i23 = 8; i23 < 377; ++i23) {
            iArr[i23 + 1] *= (int)Test.instanceCount;
            for (i25 = 68; i25 > i23; i25--) {
                int i27=-2;
                b = b;
                Test.iArrFld[i25 - 1][i23 + 1] <<= i23;
                i26 += i;
                Test.instanceCount = i27;
                i27 += (i25 * i25);
                i28 = 1;
                do {
                    f5 = Test.byFld;
                    i24 -= i25;
                    f5 = f5;
                    Test.instanceCount = i27;
                    switch (((i28 % 1) * 5) + 82) {
                    case 85:
                        i24 = (int)1.20016;
                        i27 = i23;
                        i24 = i26;
                    default:
                        if (b) {
                            i24 %= (int)(i25 | 1);
                        } else {
                            s3 += (short)(((i28 * i26) + i26) - Test.instanceCount);
                            iArr[i23 + 1] <<= i23;
                        }
                        try {
                            i = (34 % i24);
                            i24 = (-9428 / i27);
                            i24 = (i23 % 28);
                        } catch (ArithmeticException a_e) {}
                    }
                    f5 += i23;
                    i26 = 226;
                    iArr[(110 >>> 1) % N] = (int)f5;
                    Test.iArrFld[i28][i23 - 1] += i29;
                    Test.byFld = (byte)Test.dFld;
                } while (++i28 < 1);
                i *= i27;
                i = (int)Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
