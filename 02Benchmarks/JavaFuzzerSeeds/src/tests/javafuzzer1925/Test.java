package tests.javafuzzer1925;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:01:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8573187358322911382L;
    public static int iFld=-6;
    public static boolean bFld=true;
    public static float fFld=0.862F;
    public static volatile short sFld=27575;
    public static volatile byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-53);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f) {

        int i4=75, i5=-27636, i6=-1182, i7=56472, i8=4, iArr[]=new int[N];
        long l=-65459470930036477L;
        double d=105.95683, d1=29.91578;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -2853);
        FuzzerUtils.init(fArr1, -1.409F);

        i4 = 1;
        while (++i4 < 384) {
            if (false) break;
            for (i5 = 1; i5 < 4; i5++) {
                l = 1;
                do {
                    i7 = i5;
                    i7 += i4;
                    try {
                        i7 = (-34196 % i7);
                        Test.iFld = (i5 % -13923);
                        Test.iFld = (i6 / iArr[(i7 >>> 1) % N]);
                    } catch (ArithmeticException a_e) {}
                } while ((l += 2) < 2);
                switch (((i5 % 2) * 5) + 66) {
                case 69:
                    for (d = 1; d < 2; d += 3) {
                        iArr = iArr;
                        fArr1[i4] = (float)d;
                        switch (((i7 >>> 1) % 7) + 84) {
                        case 84:
                            if (Test.bFld) {
                                Test.instanceCount += (long)(d + l);
                                d1 -= i4;
                            } else if (Test.bFld) {
                                Test.bFld = Test.bFld;
                            } else if (Test.bFld) {
                                Test.iFld += (int)(58120L + (d * d));
                            } else {
                                Test.iFld = Test.iFld;
                            }
                            break;
                        case 85:
                        case 86:
                            Test.iFld += Test.iFld;
                            break;
                        case 87:
                            Test.instanceCount = -231;
                            break;
                        case 88:
                            f += (float)(d * d);
                            break;
                        case 89:
                            try {
                                iArr[i4 - 1] = (iArr[i4 - 1] % Test.iFld);
                                i8 = (415110522 / iArr[i4]);
                                i8 = (i6 / 91);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 90:
                            i7 *= -7;
                            break;
                        }
                    }
                    break;
                case 73:
                    Test.iFld += (int)Test.instanceCount;
                    break;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i4 + i5 + i6 + l + i7 + Double.doubleToLongBits(d) + i8 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static int iMeth(int i3) {

        long l1=-1928092376L;
        int i9=42278, i10=5, i11=0, i12=-45694, i13=-39081, i14=-107, i15=8, iArr1[]=new int[N];
        float f1=2.52F;
        byte by1=74;

        FuzzerUtils.init(iArr1, 110);

        vMeth1(Test.fFld);
        for (l1 = 129; 5 < l1; --l1) {
            Test.instanceCount >>>= i9;
        }
        iArr1[(i3 >>> 1) % N] *= i10;
        for (i11 = 9; i11 < 339; i11++) {
            for (i13 = 1; i13 < 5; i13++) {
                Test.instanceCount /= (i10 | 1);
                for (f1 = i11; f1 < 2; ++f1) {
                    double d2=-52.62945;
                    iArr1[i11 - 1] *= (int)d2;
                    i3 += (10 + (f1 * f1));
                    iArr1[i13 + 1] = i15;
                    i15 <<= -241;
                    by1 = (byte)i3;
                    d2 = -248;
                    i14 <<= i14;
                }
            }
        }
        long meth_res = i3 + l1 + i9 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f1) + i15 + by1 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i16=172, i17=207, i18=-250, iArr2[]=new int[N];
        long l2=-3359233731L, lArr[]=new long[N];
        float fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, 56.659F);
        FuzzerUtils.init(iArr2, -118);
        FuzzerUtils.init(sArr, (short)-1192);
        FuzzerUtils.init(lArr, 10L);

        fArr[(Test.iFld >>> 1) % N] -= (Test.iFld--);
        Test.instanceCount += iMeth(Test.iFld);
        for (i16 = 247; i16 > 11; --i16) {
            if (Test.bFld) continue;
            for (l2 = 7; 1 < l2; --l2) {
                short s=-26311;
                byte by2=-112;
                double d3=-39.6328;
                fArr[i16 + 1] -= Test.fFld;
                Test.bFld = Test.bFld;
                iArr2[i16 + 1] = 45064;
                s -= (short)i16;
                iArr2[(int)(l2)] = by2;
                switch ((i16 % 10) + 56) {
                case 56:
                    i17 += (int)(l2 + i18);
                    i17 = i17;
                    Test.iFld += (int)l2;
                    break;
                case 57:
                    i17 = (int)5416734361860879652L;
                    break;
                case 58:
                    Test.iFld <<= i17;
                case 59:
                    sArr[i16] *= (short)-7005828303454510416L;
                    break;
                case 60:
                    Test.instanceCount *= s;
                    break;
                case 61:
                    i17 >>>= i18;
                    break;
                case 62:
                    by2 >>= (byte)i17;
                case 63:
                    iArr2[(int)(l2 - 1)] -= (int)d3;
                    break;
                case 64:
                    lArr[i16] += -32223;
                    break;
                case 65:
                    iArr2[i16] *= i18;
                    break;
                }
            }
        }
        vMeth_check_sum += i16 + i17 + l2 + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=44891, i1=14897, i2=-179, i19=-106, i20=50982, i21=-7, i22=-81, i23=-7, i24=-64581, i25=40465;
        double d4=-56.82489;
        float f2=0.992F;
        byte by3=-45;

        i = 1;
        do {
            for (i1 = 3; i1 < 87; ++i1) {
                byte by=20;
                Test.instanceCount -= (++Test.iFld);
                Test.iFld += (int)Test.instanceCount;
                Test.iFld = Math.max(Test.byArrFld[i - 1] - (i2 * i), Test.iFld--);
                by += (byte)(i1 * i1);
                vMeth();
                i2 = i;
                Test.instanceCount += (i1 * i);
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount += (((i1 * Test.fFld) + Test.iFld) - Test.instanceCount);
            }
            Test.instanceCount = i;
            d4 -= i2;
            for (f2 = 87; f2 > i; f2--) {
                Test.iFld <<= by3;
                iArrFld[(int)(f2 + 1)] = (int)Test.instanceCount;
                Test.fFld = i1;
                for (i20 = i; i20 < 1; ++i20) {
                    iArrFld[i] += by3;
                }
            }
            Test.instanceCount += (((i * Test.instanceCount) + i1) - i1);
            Test.iFld *= (int)Test.instanceCount;
            Test.fFld += (i * i);
            iArrFld[i + 1] -= i20;
            for (i22 = 87; i22 > 2; --i22) {
                i2 >>= i1;
                i21 *= i20;
                for (i24 = 2; 1 < i24; --i24) {
                    if (false) break;
                    i19 += (i24 * i24);
                    Test.instanceCount = Test.sFld;
                }
            }
        } while (++i < 289);



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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
