package tests.javafuzzer2162;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:42:52 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=61211L;
    public static float fFld=0.40F;
    public static volatile boolean bFld=true;
    public double dFld=-46.47988;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, int i6) {

        int i7=2, i8=45, i9=-60416, i10=-4266, i11=36, iArr[]=new int[N];
        boolean b1=false;
        byte by=66;
        double d=-2.53671;
        long lArr1[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -210L);
        FuzzerUtils.init(fArr, 9.562F);
        FuzzerUtils.init(iArr, 0);

        Test.instanceCount = 94;
        lArr1[(11 >>> 1) % N] -= i6;
        for (i7 = 12; i7 < 269; ++i7) {
            for (i9 = i7; i9 < 6; i9++) {
                if (b1) {
                    fArr[i9 - 1] = i8;
                } else {
                    iArr[i9 - 1] >>= 0;
                }
            }
            i10 += (((i7 * i9) + by) - i7);
            Test.instanceCount = i10;
            try {
                i8 = (-36711 / i8);
                i6 = (177 / i6);
                iArr[i7 - 1] = (i10 % i6);
            } catch (ArithmeticException a_e) {}
            i6 = i8;
            i10 += i7;
            i11 = 1;
            do {
                d = d;
                i6 += (85 + (i11 * i11));
            } while (++i11 < 6);
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) + by + i11 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i3) {

        int i4=37, i5=-1191;
        boolean b=true;

        for (i4 = 8; i4 < 252; i4 += 2) {
            if (((Test.instanceCount == (--i3)) ^ ((i4 - 13510) <= -194)) && (b = b)) continue;
            i3 -= (i5--);
        }
        vMeth2(Test.fFld, i3);
        i5 *= 4;
        vMeth1_check_sum += i3 + i4 + i5 + (b ? 1 : 0);
    }

    public static void vMeth(int i2) {

        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -2405726624633638607L);

        i2 += -12;
        i2 = (int)(Test.instanceCount *= (Math.max(i2, i2) + (-15950L >> lArr[(i2 >>> 1) % N])));
        vMeth1(i2);
        Test.fFld -= i2;
        Test.fFld -= i2;
        i2 += i2;
        vMeth_check_sum += i2 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=28908, i1=-11871, i12=7560, i13=218, i14=42, iArr1[]=new int[N];
        byte by1=102, by2=35, byArr[]=new byte[N];
        float fArr1[]=new float[N];
        long lArr2[][]=new long[N][N], lArr3[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-32);
        FuzzerUtils.init(iArr1, 0);
        FuzzerUtils.init(fArr1, 1.413F);
        FuzzerUtils.init(lArr2, -2L);
        FuzzerUtils.init(lArr3, -4190627047L);

        for (i = 18; i < 334; i++) {
            Test.instanceCount <<= (i1 + (++byArr[i]));
            switch ((i % 2) + 67) {
            case 67:
                vMeth(i1);
                iArr1[i] -= i;
                fArr1[i + 1] %= (Test.instanceCount | 1);
                if (Test.bFld) {
                    Test.instanceCount &= i;
                    i1 /= (int)(i1 | 1);
                    i1 *= (int)Test.fFld;
                    Test.fFld *= Test.instanceCount;
                } else if (Test.bFld) {
                    for (i12 = 80; 4 < i12; --i12) {
                        short s=1270;
                        i13 -= -7;
                        switch (((i12 >>> 1) % 5) + 95) {
                        case 95:
                        case 96:
                            Test.instanceCount += (i12 - i1);
                            i1 += (int)Test.instanceCount;
                            s = (short)Test.fFld;
                            i14 = 1;
                            while (++i14 < 2) {
                                if (Test.bFld) break;
                                Test.bFld = Test.bFld;
                                i13 += i13;
                                Test.bFld = Test.bFld;
                                i13 += (i14 * i14);
                                iArr1[i14] = i14;
                                switch ((i14 % 4) + 86) {
                                case 86:
                                    i1 += (int)(4081183911L + (i14 * i14));
                                    Test.fFld /= (i14 | 1);
                                    lArr2[i14 + 1][i - 1] /= ((long)(dFld) | 1);
                                    Test.instanceCount += (long)Test.fFld;
                                    break;
                                case 87:
                                    s -= (short)i;
                                case 88:
                                    try {
                                        i1 = (47581 / i12);
                                        i13 = (iArr1[i12] / i14);
                                        i13 = (i % 978654683);
                                    } catch (ArithmeticException a_e) {}
                                    break;
                                case 89:
                                    i13 += (((i14 * i14) + i13) - by1);
                                default:
                                    i13 = s;
                                }
                            }
                            break;
                        case 97:
                            iArr1[i12] >>>= s;
                            break;
                        case 98:
                            iArr1[i12 + 1] = i14;
                            break;
                        case 99:
                            i1 = i1;
                        default:
                            lArr3 = FuzzerUtils.long1array(N, (long)-663821713L);
                        }
                    }
                }
                break;
            case 68:
                i1 += (i | i);
            default:
                Test.instanceCount = by2;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
