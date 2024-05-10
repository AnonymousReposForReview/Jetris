package tests.javafuzzer742;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 08:58:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-18698L;
    public static int iFld=-216;
    public static volatile double dFld=1.27032;
    public static int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -57974);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i1, int i2) {

        int i3=11, i4=-38158, i5=63294, i6=6, i7=107, i8=4, i9=3, iArr[][]=new int[N][N];
        double d=2.30630;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -56625);
        FuzzerUtils.init(fArr, 0.494F);

        i1 >>= -226;
        for (i3 = 12; i3 < 239; i3++) {
            i1 = (int)d;
            for (i5 = 1; 7 > i5; i5++) {
                i4 += (-53 + (i5 * i5));
                i6 <<= -6350;
                if (b) continue;
                iArr[i5][i5] = i6;
            }
            Test.iFld = (int)Test.instanceCount;
            i1 *= Test.iFld;
            i7 = 1;
            while (++i7 < 7) {
                switch (((i2 >>> 1) % 4) + 5) {
                case 5:
                    i8 = 1;
                    while ((i8 += 2) < 1) {
                        i4 += i7;
                    }
                    i4 += i4;
                case 6:
                    Test.iFld *= i9;
                case 7:
                    i9 |= Test.iFld;
                case 8:
                    if (b) continue;
                    break;
                default:
                    fArr = fArr;
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + (b ? 1
            : 0) + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i, byte by) {

        float f1=80.916F;
        int i10=57314, i11=18, i12=133, iArr1[]=new int[N];
        boolean b1=true;
        short s=8372;

        FuzzerUtils.init(iArr1, -6);

        vMeth1(f1, i, Test.iFld);
        Test.iFld ^= i;
        i -= (int)Test.dFld;
        i >>= Test.iFld;
        i10 = 1;
        while (++i10 < 173) {
            Test.iFld = i;
            b1 = b1;
            i += (((i10 * i) + Test.instanceCount) - i);
            if (b1) {
                try {
                    i = (i10 % i);
                    Test.iFld = (50 / i10);
                    Test.iFld = (iArr1[i10] / Test.iFld);
                } catch (ArithmeticException a_e) {}
                f1 += ((long)i10 ^ (long)f1);
                for (i11 = 1; i11 < 9; ++i11) {
                    Test.iFld += (i11 * i11);
                    i <<= 13;
                    i12 = s;
                }
            }
        }
        vMeth_check_sum += i + by + Float.floatToIntBits(f1) + i10 + (b1 ? 1 : 0) + i11 + i12 + s +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        byte by1=6;
        int i13=-175, i14=-83, i15=-48837, i16=2, i17=-11, i18=94;
        float f2=42.840F, fArr1[][]=new float[N][N];
        boolean b2=false;

        FuzzerUtils.init(fArr1, -50.341F);

        Test.iFld += Test.iFld;
        vMeth(Test.iFld, by1);
        Test.iFld = (int)Test.dFld;
        if (b2) {
            for (i13 = 4; i13 < 269; ++i13) {
                for (i15 = 1; i15 < 6; i15++) {
                    Test.iArrFld[i15] >>= i16;
                }
                i16 += (i13 | i14);
                Test.instanceCount -= (long)f2;
                i14 *= (int)Test.dFld;
                by1 >>>= (byte)22113;
            }
            fArr1[(-110 >>> 1) % N] = fArr1[(Test.iFld >>> 1) % N];
            for (i17 = 5; i17 < 210; ++i17) {
                Test.instanceCount = i13;
                i16 += (((i17 * i14) + i18) - by1);
            }
        } else if (b2) {
            Test.iFld *= (int)Test.instanceCount;
        } else {
            Test.instanceCount = i17;
        }
        long meth_res = by1 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) + i17 + i18 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=249, i20=58, i21=-20397, i22=-8, i23=171, i24=-58776, iArr2[]=new int[N];
        byte by2=0;
        short s1=19516;
        float f3=-24.431F;
        long l=-107L;
        boolean b3=true;

        FuzzerUtils.init(iArr2, -23417);

        Test.instanceCount = (long)(((0.174F % ((Test.instanceCount + 2) | 1)) + Test.iFld) * iMeth());
        for (i19 = 7; i19 < 300; i19++) {
            for (i21 = 5; i21 < 86; ++i21) {
                i22 -= by2;
                for (i23 = i19; i23 < 2; ++i23) {
                    i20 &= i22;
                    Test.dFld = -42546;
                    i24 -= i23;
                    i20 += i23;
                    s1 += (short)Test.iFld;
                    i22 = i20;
                    i22 = i23;
                    f3 += (i23 + Test.instanceCount);
                    i22 = (int)l;
                    i20 %= (int)(i20 | 1);
                }
                b3 = true;
                by2 = (byte)l;
                i20 >>= (int)l;
            }
            i24 += (int)100.24456;
        }
        i20 ^= i23;
        Test.iFld = i21;
        switch (((i24 >>> 1) % 7) + 4) {
        case 4:
        case 5:
            i22 >>= s1;
            iArr2[(Test.iFld >>> 1) % N] = s1;
            break;
        case 6:
            by2 = (byte)s1;
            i24 -= i24;
            i22 *= i21;
            Test.instanceCount -= i23;
            break;
        case 7:
            Test.iFld = i23;
            iArr2[(i20 >>> 1) % N] = (int)Test.dFld;
            break;
        case 8:
            i20 >>= (int)Test.instanceCount;
            break;
        case 9:
            l = (long)Test.dFld;
            break;
        case 10:
            fArrFld[(i20 >>> 1) % N] = i19;
            break;
        default:
            l >>= i24;
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