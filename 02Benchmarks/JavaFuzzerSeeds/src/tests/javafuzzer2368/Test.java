package tests.javafuzzer2368;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:39:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4058377505L;
    public static double dFld=-25.30628;
    public static float fFld=26.892F;
    public boolean bFld=false;
    public static short sFld=15009;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(int i6, int i7, short s) {

        int iArr1[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, -35321);
        FuzzerUtils.init(sArr, (short)-24849);

        iArr1[(i7 >>> 1) % N] = (-Math.min(32670, i6));
        iArr1[(i7 >>> 1) % N] >>>= (i7 *= -1);
        i7 += Math.min((int)(Test.dFld - (sArr[(-45142 >>> 1) % N]--)), --i7);
        vMeth1_check_sum += i6 + i7 + s + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth2() {

        int i8=3, i9=-44, i10=1, i11=24137, iArr2[]=new int[N];
        float f1=-1.802F;
        long l=-2L;
        short s1=29930;

        FuzzerUtils.init(iArr2, -16028);

        i8 <<= i8;
        i8 -= (int)Test.instanceCount;
        i8 += (int)Test.instanceCount;
        for (i9 = 164; i9 > 6; --i9) {
            iArr2[i9 - 1] = (int)f1;
            iArr2[i9] += i9;
            for (l = 1; l < 10; ++l) {
                try {
                    i10 = (i8 % i11);
                    i8 = (-165 / i9);
                    i10 = (i11 % iArr2[(int)(l - 1)]);
                } catch (ArithmeticException a_e) {}
                i11 <<= i11;
                Test.instanceCount += l;
                i10 /= (int)(i10 | 1);
                i10 -= i8;
                i8 <<= -60890;
            }
            f1 += i9;
            s1 = (short)i9;
        }
        vMeth2_check_sum += i8 + i9 + i10 + Float.floatToIntBits(f1) + l + i11 + s1 + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth() {

        int i12=18, i13=-6, i14=65070, iArr3[]=new int[N];
        short s2=4120;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr3, 11);
        FuzzerUtils.init(lArr, 22830L);

        vMeth2();
        Test.instanceCount *= Test.instanceCount;
        for (i12 = 9; i12 < 177; ++i12) {
            i13 += (i12 + Test.instanceCount);
            Test.fFld = i12;
            i13 >>= i13;
            Test.fFld = Test.instanceCount;
            switch (((i14 >>> 1) % 7) + 10) {
            case 10:
                i14 = (int)Test.dFld;
                Test.fFld = i14;
                i14 += s2;
                iArr3 = iArr3;
                break;
            case 11:
                iArr3[i12 + 1] = i14;
                i13 = i12;
                i13 = -21259;
                break;
            case 12:
                i13 -= i14;
                break;
            case 13:
                Test.instanceCount += (i12 ^ i14);
                break;
            case 14:
                lArr[i12 - 1] = i14;
            case 15:
                i13 += i14;
            case 16:
                i13 *= (int)231311874535997390L;
                break;
            default:
                Test.instanceCount += i13;
            }
        }
        long meth_res = i12 + i13 + i14 + s2 + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        short s3=-789;

        vMeth1((int)((Test.instanceCount - i5) - ((i4--) - (-12 - (Test.instanceCount - -11)))), iMeth(), s3);
        i5 -= (int)Test.fFld;
        vMeth_check_sum += i4 + i5 + s3;
    }

    public void mainTest(String[] strArr1) {

        int i=115, i1=-47851, i2=120, i3=14, i15=19034, i16=-8, i17=12, i18=-142, i19=-211, i20=8, i21=-6, i22=-6,
            i23=-151, i24=-6330, iArr[]=new int[N];
        float f=-2.606F;
        byte by=-25;
        long l1=7L;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(bArr, true);

        for (i = 22; 390 > i; ++i) {
            iArr[i + 1] *= (int)(((i1 + 120.13459) - (i - i)) - ((-7 - (i1 = 237)) + (f - -48904)));
            i1 *= ((i1--) + by);
            for (i2 = 68; i2 > i; i2--) {
                f += (((i2 * i2) + i3) - i3);
                i1 += (i2 * i2);
                vMeth(i, i3);
                Test.instanceCount = Test.instanceCount;
            }
            i3 <<= -180;
            for (i15 = 68; 2 < i15; --i15) {
                iArr[i - 1] >>= (int)Test.instanceCount;
                Test.fFld += i3;
                i1 -= i1;
            }
            bArr[i - 1] = bFld;
            iArr[i - 1] &= i;
            i16 <<= i2;
            i16 += 100;
            Test.instanceCount >>>= -13;
        }
        for (i17 = 9; i17 < 374; ++i17) {
            for (i19 = 3; i19 < 69; ++i19) {
                i1 -= (int)Test.instanceCount;
            }
            Test.sFld <<= (short)Test.instanceCount;
            Test.sFld = (short)i18;
            i3 += i2;
            Test.fFld += i;
            i20 += (((i17 * f) + i) - l1);
            for (i21 = 3; i21 < 69; ++i21) {
                for (i23 = 1; i23 < 2; ++i23) {
                    iArr[i21 + 1] = i20;
                    i16 = i2;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
