package tests.javafuzzer1000;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:48:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2376878464L;
    public int iFld=-13268;
    public static boolean bFld=true;
    public short sFld=-23278;
    public static int iFld1=-47233;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.fArrFld, -61.259F);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i8) {

        int i9=-8, i10=-6, i11=86, i12=-212, i13=-14, i14=-64844;
        float f1=-29.214F, fArr[]=new float[N];
        byte by=-6;

        FuzzerUtils.init(fArr, 89.496F);

        for (i9 = 13; i9 < 383; ++i9) {
            i8 >>= i9;
            Test.iArrFld = Test.iArrFld;
            switch ((((i8 >>> 1) % 7) * 5) + 12) {
            case 15:
                Test.iArrFld[i9 - 1] = (int)f1;
                for (i11 = 1; i11 < 5; ++i11) {
                    i8 -= i9;
                    try {
                        Test.iArrFld[i9 + 1] = (-173 % i8);
                        i8 = (Test.iArrFld[i11 + 1] % i9);
                        i12 = (i10 % Test.iArrFld[i11 + 1]);
                    } catch (ArithmeticException a_e) {}
                    for (i13 = 2; 1 < i13; i13--) {
                        i8 >>= 27755;
                        Test.instanceCount += (i13 + Test.instanceCount);
                        Test.iArrFld[i9 + 1] = (int)-48.21506;
                        fArr[i9] *= Test.instanceCount;
                        by += (byte)i12;
                        i8 = i8;
                    }
                }
                break;
            case 23:
                i14 *= (int)54.130543;
                break;
            case 31:
                i12 = -9353;
                break;
            case 20:
                i10 = (int)Test.instanceCount;
                break;
            case 30:
                Test.iArrFld = Test.iArrFld;
            case 25:
                Test.bFld = false;
            case 37:
                Test.instanceCount = -144;
                break;
            default:
                i10 += (((i9 * i14) + i11) - Test.instanceCount);
            }
        }
        vMeth_check_sum += i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(int i5, int i6, int i7) {

        short s=-19947;
        float f2=117.113F, fArr1[][]=new float[N][N];

        FuzzerUtils.init(fArr1, 1.749F);

        vMeth(i6);
        Test.instanceCount += i7;
        s = (short)i5;
        Test.iArrFld[(i7 >>> 1) % N] -= (int)f2;
        fArr1 = FuzzerUtils.float2array(N, (float)88.211F);
        i7 += (int)Test.instanceCount;
        long meth_res = i5 + i6 + i7 + s + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(double d, int i2) {

        int i3=8520, i4=25371, i15=19577, i16=40174;
        float f=0.422F, f3=-41.342F;
        boolean b=false;
        byte by1=-117;

        i3 = 1;
        do {
            Test.instanceCount -= Test.instanceCount;
            i2 = Test.iArrFld[i3];
            Test.instanceCount >>= (--Test.iArrFld[i3 + 1]);
            i2 >>= (int)(f * (Test.instanceCount + (Test.iArrFld[i3 - 1]--)));
        } while (++i3 < 322);
        i4 = 1;
        while (++i4 < 172) {
            b = (((f - 14607) * i4) != (-(i2 + -208)));
        }
        d = (iMeth1(i15, i2, i4) + by1);
        i15 *= (int)f;
        Test.bFld = b;
        for (f3 = 15; f3 < 344; f3++) {
            i15 *= (int)Test.instanceCount;
            i2 += (int)12.20109;
        }
        i15 *= i3;
        Test.instanceCount = i4;
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + Float.floatToIntBits(f) + i4 + (b ? 1 : 0) + i15 + by1 +
            Float.floatToIntBits(f3) + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14, i1=1, i17=19, i18=-2, i19=-237, i20=-112, i21=10, i22=-36839;
        double d1=-1.131049;
        float f4=-118.483F, f5=0.107F;

        iFld += (int)(iFld + (Test.iArrFld[(iFld >>> 1) % N] + Long.reverseBytes(Test.instanceCount)));
        for (i = 1; i < 169; ++i) {
            i1 += i;
            i1 = (int)(iMeth(d1, i) % 148L);
            if (Test.bFld) {
                for (f4 = 3; f4 < 149; ++f4) {
                    i17 = iFld;
                }
                Test.instanceCount *= (long)f5;
                Test.fArrFld = Test.fArrFld;
            }
        }
        i17 = (int)d1;
        Test.instanceCount = i1;
        iFld = 59;
        f5 += f5;
        i17 = 200;
        Test.iArrFld[(i1 >>> 1) % N] >>= i;
        try {
            if (Test.bFld) {
                i1 |= i1;
                Test.iArrFld[(i17 >>> 1) % N] = sFld;
            } else if (Test.bFld) {
                i18 = 1;
                do {
                    for (i19 = 80; i19 > 5; --i19) {
                        try {
                            iFld = (i17 / i);
                            iFld = (-191 / i17);
                            i17 = (41397 / i18);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount = 47;
                        Test.instanceCount += (((i19 * i18) + iFld) - f4);
                        for (i21 = 1; i21 < 2; i21++) {
                            iFld += i21;
                            i20 += (i21 * i21);
                            i1 *= i1;
                            i20 >>= (int)Test.instanceCount;
                            d1 = i17;
                        }
                    }
                } while (++i18 < 313);
            }
        }
        catch (NullPointerException exc1) {
            Test.iFld1 = (int)Test.instanceCount;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
