package tests.javafuzzer3100;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:49:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=219L;
    public int iFld=106;
    public byte byFld=-1;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3) {

        double d=87.34787, d1=82.30701;
        int i4=5, i5=-5694, i6=-174, i7=226, i8=7;
        byte by=-16;
        float f=0.167F;
        boolean b=false;

        for (d = 7; d < 158; ++d) {
            by = (byte)i4;
            i3 = i3;
            i3 = i4;
            for (i5 = 1; i5 < 10; i5 += 3) {
                i3 *= (int)Test.instanceCount;
                i4 += (int)d;
                f = i4;
                for (i7 = 4; i7 > 1; i7 -= 2) {
                    i4 -= (int)-1.156F;
                    by >>= (byte)i5;
                    Test.instanceCount += i7;
                    d1 += Test.instanceCount;
                    b = true;
                    i8 *= i4;
                }
            }
        }
        long meth_res = i3 + Double.doubleToLongBits(d) + i4 + by + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 +
            Double.doubleToLongBits(d1) + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i9=49, i10=-7, i11=5, i12=201, i13=6, i14=13, i15=13, i16=-32, iArr[]=new int[N];
        byte by1=96;
        boolean b1=false;
        short s=-32303;
        double d2=36.105886;

        FuzzerUtils.init(iArr, 10);

        i2 -= iMeth(130);
        for (i9 = 6; i9 < 201; ++i9) {
            for (i11 = i9; i11 < 8; i11++) {
                for (i13 = 1; i13 < 1; ++i13) {
                    by1 *= (byte)i10;
                    if (b1) break;
                    iArr[i13 - 1] = i11;
                }
                by1 += (byte)(i11 * i11);
                switch ((((i9 >>> 1) % 4) * 5) + 122) {
                case 123:
                case 127:
                    iArr[i9 + 1] -= s;
                    break;
                case 139:
                    switch (((i11 % 6) * 5) + 76) {
                    case 87:
                        for (i15 = 1; 1 > i15; ++i15) {
                            i14 = i13;
                            if (b1) continue;
                            Test.instanceCount %= (i13 | 1);
                        }
                        break;
                    case 99:
                        i2 += (((i11 * s) + i12) - Test.instanceCount);
                    case 91:
                        d2 += i15;
                        break;
                    case 89:
                        i16 = (int)Test.instanceCount;
                        break;
                    case 84:
                        Test.instanceCount -= Test.instanceCount;
                    case 105:
                        if (b1) break;
                        break;
                    default:
                        i2 += i9;
                    }
                case 124:
                    Test.instanceCount += (i11 * i11);
                    break;
                default:
                    Test.instanceCount += (i11 * Test.instanceCount);
                }
            }
        }
        vMeth1_check_sum += i2 + i9 + i10 + i11 + i12 + i13 + i14 + by1 + (b1 ? 1 : 0) + s + i15 + i16 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i, int i1) {


        vMeth1(-128);
        vMeth_check_sum += i + i1;
    }

    public void mainTest(String[] strArr1) {

        int i17=-204, i18=188, iArr1[][]=new int[N][N];
        boolean b2=false, bArr[][]=new boolean[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1124554983660766473L);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr1, -40);

        vMeth(iFld, iFld);
        for (i17 = 10; 289 > i17; i17++) {
            i18 ^= iFld;
            lArr[i17 + 1] -= iFld;
        }
        iFld *= byFld;
        bArr[(i18 >>> 1) % N][(-23260 >>> 1) % N] = b2;
        iArr1[(iFld >>> 1) % N][(i18 >>> 1) % N] |= (int)Test.instanceCount;
        Test.instanceCount -= byFld;
        iArr1[(i18 >>> 1) % N] = iArr1[(i17 >>> 1) % N];
        lArr[(i18 >>> 1) % N] += i18;
        iFld >>= (int)Test.instanceCount;


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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
