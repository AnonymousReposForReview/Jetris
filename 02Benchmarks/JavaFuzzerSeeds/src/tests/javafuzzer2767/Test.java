package tests.javafuzzer2767;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:56:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=60957L;
    public float fFld=0.47F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -80);
        FuzzerUtils.init(Test.lArrFld, 8965434847544477363L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, int i8, float f1) {

        float f2=-87.305F;
        int i9=-60931, i10=62243, i11=108, iArr[][]=new int[N][N];
        double d=-1.74595;

        FuzzerUtils.init(iArr, -30567);

        Test.instanceCount = Test.instanceCount;
        i7 = i8;
        i7 = i7;
        i8 -= -2;
        for (f2 = 355; f2 > 8; f2--) {
            Test.instanceCount += (long)(((f2 * Test.instanceCount) + i8) - Test.instanceCount);
            i9 = i9;
            iArr[(int)(f2)][(int)(f2)] -= i7;
            iArr[(int)(f2 + 1)][(int)(f2 - 1)] = i8;
            for (i10 = 1; i10 < 5; ++i10) {
                Test.instanceCount -= (long)f2;
                i7 = 2589;
                d = f2;
                d = Test.instanceCount;
                iArr[i10 - 1] = FuzzerUtils.int1array(N, (int)25185);
            }
        }
        vMeth1_check_sum += i7 + i8 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i9 + i10 + i11 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, long l1, int i6) {

        float f3=63.645F, fArr[]=new float[N];
        int i12=120, i13=-13, i14=-229, i15=-5, i16=9;
        byte by1=-6;
        boolean b=true;

        FuzzerUtils.init(fArr, -1.712F);

        vMeth1(i6, i5, f3);
        for (i12 = 14; i12 < 232; i12 += 2) {
            i6 -= i12;
            by1 += (byte)(i12 | i5);
            i13 += (((i12 * i13) + l1) - l1);
            if (true) {
                fArr = fArr;
                i6 *= i5;
                i14 = 1;
                while (++i14 < 14) {
                    i5 -= (int)l1;
                    l1 += (i14 * i14);
                    i6 += i14;
                    for (i15 = 1; i15 < 1; ++i15) {
                        l1 = i15;
                    }
                    b = b;
                }
            } else {
                i6 = i13;
            }
        }
        vMeth_check_sum += i5 + l1 + i6 + Float.floatToIntBits(f3) + i12 + i13 + by1 + i14 + i15 + i16 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i2, int i3, long l) {

        float f=42.530F, f4=-2.633F;
        int i4=18835, i17=-6, i18=60101, i19=-4102;
        double d1=1.122258;
        short s=-24736;
        boolean b1=false;

        for (f = 8; f < 234; ++f) {
            vMeth(i4, Test.instanceCount, -34153);
            i2 >>= (int)Test.instanceCount;
            i17 = 1;
            do {
                d1 -= s;
                Test.iArrFld[i17 - 1] *= i4;
                b1 = b1;
                for (i18 = 1; i18 < 1; ++i18) {
                    d1 -= i3;
                    switch ((i18 % 8) + 116) {
                    case 116:
                        switch ((i18 % 1) + 3) {
                        case 3:
                            i2 = i3;
                            i4 += (i18 ^ Test.instanceCount);
                            Test.instanceCount >>>= -1;
                            Test.instanceCount += (i18 + i17);
                        default:
                            i4 ^= i17;
                        }
                        break;
                    case 117:
                        i19 = -5;
                        break;
                    case 118:
                        i3 += i4;
                        break;
                    case 119:
                        Test.instanceCount >>>= Test.instanceCount;
                        break;
                    case 120:
                        f4 += l;
                        break;
                    case 121:
                        f4 = s;
                        break;
                    case 122:
                        i19 -= (int)l;
                        break;
                    case 123:
                        i2 += (int)Test.instanceCount;
                        break;
                    default:
                        i3 += (int)Test.instanceCount;
                    }
                }
            } while (++i17 < 7);
        }
        long meth_res = i2 + i3 + l + Float.floatToIntBits(f) + i4 + i17 + Double.doubleToLongBits(d1) + s + (b1 ? 1 :
            0) + i18 + i19 + Float.floatToIntBits(f4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=26, i1=-54766, i20=-41336, i21=-10, i22=52, i23=-234, i24=53, i25=-10172, i26=-71;
        byte by=74, byArr[][]=new byte[N][N];
        double d2=65.85163;
        boolean b2=false, b3=false, bArr[]=new boolean[N];
        short s1=-31593;

        FuzzerUtils.init(byArr, (byte)-82);
        FuzzerUtils.init(bArr, false);

        byArr[(i >>> 1) % N][(i1 >>> 1) % N] %= (byte)(i | 1);
        i1 += (int)(((-126 + (++i1)) - (by - fFld)) + ((++i1) - iMeth(i, i, Test.instanceCount)));
        for (i20 = 7; 126 > i20; i20++) {
            for (i22 = i20; i22 < 211; ++i22) {
                d2 = i21;
                for (i24 = 1; i24 < 1; i24++) {
                    Test.instanceCount += i25;
                    Test.iArrFld[i24 - 1] = 8;
                    i21 += i24;
                    fFld = i23;
                    switch ((i24 % 10) + 116) {
                    case 116:
                        i *= 11;
                        i1 += (((i24 * i23) + Test.instanceCount) - fFld);
                        Test.instanceCount *= i21;
                        break;
                    case 117:
                        Test.instanceCount = i;
                        fFld += Test.instanceCount;
                        Test.lArrFld[i24 - 1] -= 36026;
                        break;
                    case 118:
                        i += (((i24 * i22) + i24) - Test.instanceCount);
                    case 119:
                        i1 += i24;
                        Test.instanceCount &= i25;
                        i1 -= by;
                        i1 = (int)Test.instanceCount;
                        break;
                    case 120:
                        if (false) break;
                        b2 = true;
                        i >>= i22;
                        break;
                    case 121:
                        fFld = 0.411F;
                        switch (((i20 % 7) * 5) + 36) {
                        case 64:
                            try {
                                i25 = (i22 % i24);
                                i26 = (i20 % i20);
                                i25 = (-4916 / i22);
                            } catch (ArithmeticException a_e) {}
                            Test.instanceCount += (i24 - i21);
                            i25 += i24;
                        case 49:
                        case 44:
                            b3 = b3;
                        case 43:
                            i23 += (i24 * i24);
                            break;
                        case 37:
                            bArr[i20 + 1] = b3;
                            break;
                        case 70:
                        case 46:
                            fFld += (-56.78F + (i24 * i24));
                            break;
                        default:
                            Test.iArrFld[i24 + 1] += (int)fFld;
                        }
                        break;
                    case 122:
                        b2 = b3;
                        break;
                    case 123:
                        i23 <<= 7;
                        break;
                    case 124:
                        i21 += (i24 ^ s1);
                    case 125:
                        i = i21;
                        break;
                    default:
                        i += (int)fFld;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
