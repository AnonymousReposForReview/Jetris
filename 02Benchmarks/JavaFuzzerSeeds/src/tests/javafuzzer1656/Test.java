package tests.javafuzzer1656;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:47:39 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3137270686593043167L;
    public static volatile double dFld=2.99582;
    public boolean bFld=false;
    public static float fFld=-2.863F;
    public static double dArrFld[][]=new double[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -2.93287);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        boolean b=true;

        Test.instanceCount += i6;
        i6 += i6;
        i6 *= (int)Test.dFld;
        b = b;
        vMeth1_check_sum += i6 + (b ? 1 : 0);
    }

    public static void vMeth(int i3, int i4, int i5) {

        float f=-1.557F, f1=-122.336F, fArr1[]=new float[N];
        int i7=42136, i8=200, iArr[]=new int[N];
        short s=23723;
        byte by=71;

        FuzzerUtils.init(fArr1, -26.725F);
        FuzzerUtils.init(iArr, 13978);

        vMeth1(i4);
        f = (float)0.104949;
        for (f1 = 181; f1 > 5; f1--) {
            boolean b1=true;
            i4 = (int)1.17618;
            Test.instanceCount = 20529;
            Test.dArrFld[(int)(f1)] = FuzzerUtils.double1array(N, (double)0.15036);
            fArr1[(i4 >>> 1) % N] += 22183;
            i5 = i5;
            i5 = (int)f1;
            if (b1) {
                Test.instanceCount += (long)(f1 * f1);
                iArr = FuzzerUtils.int1array(N, (int)16918);
                i8 = 1;
                while (++i8 < 9) {
                    iArr[(int)(f1 - 1)] += -50027;
                    s >>>= by;
                }
            } else if (false) {
                if (b1) break;
            } else {
                if (b1) break;
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i7 + i8 + s + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i2) {

        int i9=17078, i10=-47137, i11=-116, iArr1[]=new int[N];
        boolean b2=false;
        float f2=50.730F, fArr2[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 1);
        FuzzerUtils.init(fArr2, 106.6F);
        FuzzerUtils.init(byArr, (byte)-97);

        vMeth(i2, i2, i2);
        i2 &= i2;
        iArr1[(i2 >>> 1) % N] = i2;
        i2 += i2;
        if (b2) {
            fArr2[(i2 >>> 1) % N] += i2;
            for (i9 = 7; 185 > i9; i9++) {
                b2 = b2;
                i11 = 1;
                while (++i11 < 9) {
                    f2 -= (float)Test.dFld;
                    byArr = byArr;
                }
                i2 = i9;
                i2 -= 9849;
                i2 >>>= -17523;
                i2 += (i9 ^ i9);
            }
        }
        long meth_res = i2 + i9 + i10 + (b2 ? 1 : 0) + i11 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=29, i1=-28427, i12=122, i13=-240, i14=10, i15=2, i16=-6;
        short s1=17721;
        byte by1=33, byArr1[]=new byte[N];
        float fArr[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr, 121.462F);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(byArr1, (byte)98);

        for (i = 145; 5 < i; i--) {
            i1 <<= (int)((-i1) + ((fArr[i + 1]++) - iMeth(i12)));
            for (i13 = 1; i13 < 179; ++i13) {
                switch ((i13 % 7) + 61) {
                case 61:
                    iArrFld[i13 - 1] >>>= i13;
                    if (bFld) {
                        for (i15 = 1; i15 < 2; i15++) {
                            i12 = -249;
                            s1 += (short)Test.dFld;
                            switch (((i15 >>> 1) % 2) + 4) {
                            case 4:
                                i16 = i13;
                                i14 += (i15 | i);
                                i16 = i1;
                                break;
                            case 5:
                                if (bFld) break;
                                i1 -= i16;
                                switch ((i13 % 4) + 15) {
                                case 15:
                                    iArrFld[i13 - 1] = -18850;
                                    break;
                                case 16:
                                    i16 += (int)Test.dFld;
                                    Test.instanceCount = i;
                                    i1 |= 191;
                                    i12 += i12;
                                case 17:
                                    i14 = i16;
                                    iArrFld[i15 - 1] >>= -13;
                                case 18:
                                    Test.dArrFld[i13 + 1] = Test.dArrFld[i - 1];
                                default:
                                    Test.dFld %= (Test.instanceCount | 1);
                                    bArr[i - 1] = bFld;
                                }
                                break;
                            }
                        }
                        by1 -= (byte)Test.instanceCount;
                        Test.instanceCount += i1;
                        i12 &= (int)Test.instanceCount;
                    }
                    break;
                case 62:
                    try {
                        i1 = (-10767 / i15);
                        i12 = (-235 / i1);
                        i12 = (i15 % i15);
                    } catch (ArithmeticException a_e) {}
                case 63:
                    i14 ^= (int)Test.instanceCount;
                case 64:
                    Test.fFld += (i13 * i13);
                    break;
                case 65:
                    Test.fFld *= -7L;
                case 66:
                    if (bFld) continue;
                    break;
                case 67:
                    byArr1[i] = (byte)Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}