package tests.javafuzzer55;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:38:11 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=1020801753765918142L;
    public static int iFld=18511;
    public static boolean bFld=true;
    public static volatile double dFld=-2.35176;
    public static short sFld=13686;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -54.1021F);
        FuzzerUtils.init(Test.iArrFld, 29459);
    }

    public static long bMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth() {

        int i3=-12, i4=-45728, i5=7, i6=-230, i7=-1, i8=4, iArr1[]=new int[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)114);
        FuzzerUtils.init(iArr1, -4);

        for (i3 = 2; i3 < 262; ++i3) {
            for (i5 = 1; i5 < 6; ++i5) {
                float f1=19.60F;
                f1 -= Test.instanceCount;
                i4 += (i5 - f1);
                i4 = i3;
                i6 *= i5;
                Test.iFld += i3;
                byArr[i3] = (byte)i5;
                f1 += (i5 * i5);
                for (i7 = i3; 2 > i7; i7++) {
                    if (Test.bFld) continue;
                    switch ((i7 % 8) + 44) {
                    case 44:
                        i4 += (((i7 * Test.instanceCount) + f1) - f1);
                        Test.bFld = Test.bFld;
                        break;
                    case 45:
                        i8 += (((i7 * i5) + Test.instanceCount) - i3);
                        break;
                    case 46:
                    case 47:
                        iArr1 = iArr1;
                        break;
                    case 48:
                        iArr1[i7 - 1] *= i7;
                        break;
                    case 49:
                        Test.fArrFld[i7 + 1] -= i7;
                        break;
                    case 50:
                        Test.dFld = Test.instanceCount;
                    case 51:
                        Test.bFld = true;
                        break;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static double dMeth(long l, double d) {

        int i2=11, iArr[]=new int[N];
        short s=-18548;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(fArr, 1.152F);

        iArr[(Test.iFld >>> 1) % N] += (int)(((--l) + (-6 - (++iArr[(Test.iFld >>> 1) % N]))) + Math.abs(Test.iFld *
            27668));
        iArr[(Test.iFld >>> 1) % N] += Integer.reverseBytes(Math.abs((int)(Test.iFld *= (int)Test.instanceCount)));
        i2 = 1;
        do {
            fArr[i2 - 1] *= ((++Test.iFld) + i2);
            l *= Short.reverseBytes(s);
            Test.iFld -= (int)(byMeth() + l);
        } while (++i2 < 180);
        Test.iFld += Test.iFld;
        Test.iFld |= (int)Test.instanceCount;
        long meth_res = l + Double.doubleToLongBits(d) + i2 + s + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static boolean bMeth(int i, int i1, float f) {

        int i9=-14, i10=3, i11=6, i12=-28432, i13=-62602;
        float f2=1.141F;
        double d1=1.5557;
        short s1=14094;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2156001482L);

        Test.instanceCount /= ((long)(dMeth(Test.instanceCount, Test.dFld)) | 1);
        i9 = 1;
        while (++i9 < 204) {
            lArr[i9] *= i9;
            i += i9;
        }
        f += i9;
        for (f2 = 1; f2 < 323; f2 += 2) {
            try {
                i1 = (i / i);
                i1 = (i % Test.iFld);
                i10 = (-10 % i);
            } catch (ArithmeticException a_e) {}
            for (d1 = f2; d1 < 10; d1++) {
                f *= Test.iFld;
                i11 = 80;
                Test.fArrFld = FuzzerUtils.float1array(N, (float)98.182F);
                f = -207;
                for (i12 = 1; 1 > i12; i12++) {
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)-3);
                }
            }
            i11 += (int)(f2 * s1);
        }
        long meth_res = i + i1 + Float.floatToIntBits(f) + i9 + Float.floatToIntBits(f2) + i10 +
            Double.doubleToLongBits(d1) + i11 + i12 + i13 + s1 + FuzzerUtils.checkSum(lArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        float f3=-64.976F, f4=52.774F;
        byte by=84;
        int i14=-217, i15=37898, i16=238, i17=9, i18=-230;

        bMeth(Test.iFld, Test.iFld, f3);
        Test.dFld += 166;
        Test.iFld += (int)Test.instanceCount;
        Test.dFld -= Test.iFld;
        Test.iArrFld[(Test.iFld >>> 1) % N] += by;
        Test.instanceCount = Test.instanceCount;
        Test.iFld += Test.iFld;
        Test.iFld = Test.iFld;
        Test.iArrFld = Test.iArrFld;
        Test.instanceCount += Test.instanceCount;
        Test.iFld = (int)Test.instanceCount;
        try {
            lArrFld[(7 >>> 1) % N] += Test.iFld;
            Test.iFld += Test.iFld;
        }
        catch (NegativeArraySizeException exc1) {
            Test.iFld >>= -37761;
        }
        Test.sFld -= (short)Test.iFld;
        f4 = 1;
        while (++f4 < 270) {
            switch (((Test.iFld >>> 1) % 1) + 10) {
            case 10:
                for (i14 = 3; i14 < 93; i14 += 2) {
                    for (i16 = 1; i16 < 3; ++i16) {
                        Test.iFld <<= -63747;
                        switch (((i14 % 4) * 5) + 27) {
                        case 42:
                            Test.instanceCount %= (Test.iFld | 1);
                            break;
                        case 44:
                            i15 = i14;
                            lArrFld[i14] = Test.instanceCount;
                            try {
                                i18 = (175 % i14);
                                i15 = (i14 / 18181178);
                                i17 = (i16 % -929480928);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount -= Test.iFld;
                            break;
                        case 28:
                            lArrFld[i14 + 1] = (long)f3;
                            by >>= (byte)Test.instanceCount;
                        case 30:
                            iArrFld1[(int)(f4 - 1)] += i15;
                            break;
                        default:
                            lArrFld = lArrFld;
                        }
                    }
                }
                break;
            default:
                i17 += Test.iFld;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  dMeth ->  dMeth bMeth mainTest
//DEBUG  byMeth ->  byMeth dMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
