package tests.javafuzzer2388;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:59:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3903454362L;
    public static double dFld=2.114965;
    public static short sFld=-10052;
    public float fFld=2.742F;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, int i4, int i5) {

        short s=-15050;
        int i6=-50681, i7=-37554, i8=38981, i9=-247, i10=46286, i11=189, iArr[]=new int[N];
        float f=-2.880F;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -23.116667);
        FuzzerUtils.init(iArr, 44555);

        i4 |= (int)Test.instanceCount;
        switch ((((i4 >>> 1) % 9) * 5) + 98) {
        case 100:
            s += (short)Test.dFld;
            for (i6 = 7; i6 < 171; ++i6) {
                for (i8 = 1; i8 < 10; i8++) {
                    f -= Test.instanceCount;
                    b = b;
                    i9 >>= -25250;
                    i3 += i8;
                    dArr[(i3 >>> 1) % N] -= Test.instanceCount;
                    Test.instanceCount += i3;
                    b = b;
                    for (i10 = 2; i10 > 1; i10 -= 2) {
                        i5 += 13;
                    }
                    i5 *= i3;
                }
            }
            break;
        case 99:
            i4 = i5;
        case 142:
            iArr[(i3 >>> 1) % N] = i11;
        case 135:
            iArr[(i8 >>> 1) % N] = i9;
            break;
        case 134:
            i3 %= (int)(i9 | 1);
            break;
        case 120:
            i11 = (int)Test.instanceCount;
        case 121:
            i5 += (int)Test.instanceCount;
            break;
        case 112:
            iArr[(-30399 >>> 1) % N] *= i6;
            break;
        case 106:
        }
        long meth_res = i3 + i4 + i5 + s + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + (b ? 1 : 0) + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i2) {


        i2 &= (int)(lMeth(i2, i2, 194) >> i2);
        vMeth_check_sum += i2;
    }

    public static int iMeth() {

        int i1=223, i12=-29548, i13=183, i14=9, i15=12, iArr1[]=new int[N];
        float f1=0.891F, f2=-37.988F;

        FuzzerUtils.init(iArr1, -165);

        Test.instanceCount *= (i1++);
        vMeth(i1);
        i1 -= (int)f1;
        switch ((((i1 >>> 1) % 4) * 5) + 73) {
        case 86:
            f2 = 1;
            do {
                iArr1[(int)(f2)] >>= i1;
                for (i12 = 1; i12 < 5; i12++) {
                    for (i14 = 2; i14 > 1; --i14) {
                        boolean b1=true;
                        i1 -= -212;
                        i13 >>= i14;
                        i13 -= i14;
                        if (b1) continue;
                        if (b1) break;
                        i15 -= i12;
                    }
                    Test.dFld *= 41358;
                }
            } while (++f2 < 308);
            break;
        case 92:
            i15 %= (int)(i14 | 1);
            break;
        case 83:
            Test.instanceCount = Test.instanceCount;
            break;
        case 84:
            Test.instanceCount = Test.instanceCount;
            break;
        }
        long meth_res = i1 + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14, i16=16711, i17=11, i18=-8, i19=53535, i20=-12572, i21=-3, i22=-205, iArr2[]=new int[N];
        double d=-1.39279;
        float f3=-57.607F, f4=0.629F, fArr[]=new float[N];
        boolean b2=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, 151);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr, -60.906F);

        i -= (int)(((--i) - (d++)) - ((i * Test.instanceCount) - iMeth()));
        if (b2) {
            i = i;
            iArr2[(i >>> 1) % N] = 5;
            for (i16 = 12; i16 < 312; i16++) {
                i += (int)Test.instanceCount;
                for (i18 = i16; i18 < 84; ++i18) {
                    i ^= Test.sFld;
                    for (f3 = 1; f3 < 1; ++f3) {
                        i17 = i20;
                        i20 = 10;
                        if (b2) {
                            i = (int)Test.instanceCount;
                        }
                        Test.instanceCount <<= i;
                        i19 &= i19;
                        bArr[i16] = b2;
                        Test.instanceCount = i18;
                    }
                    for (i21 = i16; i21 < 1; i21++) {
                        fArr[i16 + 1] += (float)Test.dFld;
                        switch ((i16 % 10) + 38) {
                        case 38:
                            Test.sFld += (short)(i21 * i21);
                            i = 150;
                            i17 -= i16;
                        case 39:
                        case 40:
                            i += i21;
                            iArr2[i16 - 1] -= (int)Test.instanceCount;
                            Test.instanceCount *= i18;
                            Test.sFld >>>= (short)i;
                        case 41:
                            try {
                                iArr2[i16] = (i22 / i);
                                i19 = (i16 / i19);
                                i22 = (906619333 % iArr2[i21 + 1]);
                            } catch (ArithmeticException a_e) {}
                            d -= f3;
                            break;
                        case 42:
                        case 43:
                            if (b2) break;
                            break;
                        case 44:
                            i17 += (i21 | Test.instanceCount);
                        case 45:
                            i19 += (int)Test.instanceCount;
                        case 46:
                            Test.instanceCount = i;
                        case 47:
                            i22 |= 6621;
                            break;
                        default:
                            fFld += (((i21 * Test.instanceCount) + f4) - i17);
                        }
                    }
                }
            }
        } else if (b2) {
            fFld += i22;
        } else if (b2) {
            iArr2 = iArr2;
        } else {
            i17 += (int)d;
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
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
