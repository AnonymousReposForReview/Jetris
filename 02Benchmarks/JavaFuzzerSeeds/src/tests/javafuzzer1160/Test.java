package tests.javafuzzer1160;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:55:35 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-11391116L;
    public static short sFld=22149;
    public static double dFld=0.93911;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 52548);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1, int i5) {

        double d=1.108666;
        int i6=13716, i7=-12, i8=-13, i9=11;
        boolean b=true;
        long l2=2558559054L, lArr[]=new long[N];
        byte by=-123;

        FuzzerUtils.init(lArr, 1734453017L);

        i5 = (int)l1;
        i5 *= (int)d;
        switch ((((i5 >>> 1) % 2) * 5) + 21) {
        case 24:
        case 27:
            i5 += i5;
            for (i6 = 6; i6 < 200; ++i6) {
                lArr[i6] |= i5;
                if (b) continue;
                for (l2 = 1; 8 > l2; ++l2) {
                    b = b;
                    i5 += Test.sFld;
                    by += (byte)Test.sFld;
                    Test.sFld -= (short)1.103734;
                    i9 = 1;
                    while (++i9 < 2) {
                        d -= i7;
                        Test.sFld %= (short)(Test.sFld | 1);
                    }
                }
            }
            break;
        }
        vMeth1_check_sum += l1 + i5 + Double.doubleToLongBits(d) + i6 + i7 + (b ? 1 : 0) + l2 + i8 + by + i9 +
            FuzzerUtils.checkSum(lArr);
    }

    public static float fMeth(int i1) {

        int i2=-36071, i3=-13, i4=-130, i10=56953, i11=12;
        float f=-93.694F;

        i1 *= (int)(--Test.instanceCount);
        try {
            i1 -= ((i1++) * ((i1 + i1) - (++i1)));
        }
        catch (NullPointerException exc2) {
            i11 = -95;
        }
        catch (UserDefinedExceptionTest exc3) {
            for (i2 = 7; i2 < 255; i2++) {
                i4 = 1;
                do {
                    vMeth1(7440L, i2);
                    switch ((i4 % 2) + 109) {
                    case 109:
                        Test.iArrFld = Test.iArrFld;
                        for (i10 = i2; i10 < 1; ++i10) {
                            i3 = (int)4185770612L;
                        }
                        i1 += Test.sFld;
                    case 110:
                        i1 += (((i4 * i4) + f) - i3);
                        f += 245;
                        f += ((long)i4 | (long)i2);
                        break;
                    }
                    i3 *= i3;
                } while (++i4 < 7);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i10 + i11 + Float.floatToIntBits(f);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(long l) {

        int i12=11, i13=-8, i14=-233, i15=-5, i16=-14, i17=150, i18=10, iArr1[]=new int[N];
        byte by1=-13;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(lArr1, 1383403471L);

        Test.instanceCount -= (long)fMeth(i12);
        i12 = i12;
        for (i13 = 11; i13 < 314; i13++) {
            if (true) break;
            iArr1[i13] = -11;
        }
        Test.iArrFld[(i13 >>> 1) % N] = i12;
        i12 += (int)Test.dFld;
        by1 = (byte)i13;
        for (i15 = 23; i15 < 398; ++i15) {
            i12 = (int)1.639F;
            i16 *= i12;
            i14 += -236;
            for (i17 = 1; i17 < 5; i17 += 3) {
                i16 = -2;
                lArr1[i17 - 1] ^= i12;
            }
        }
        vMeth_check_sum += l + i12 + i13 + i14 + by1 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=12794, i19=-3, i20=21860, i21=96, i22=119, i23=25381, i24=-98, i25=242, i26=21728, i27=-92, i28=-10504,
            iArr[][]=new int[N][N];
        float f2=-3.884F, fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(fArr, -32.819F);
        FuzzerUtils.init(lArr2, 7L);

        i -= (Test.sFld = (short)((-(Test.iArrFld[(-19390 >>> 1) % N]--)) >>> i));
        iArr = FuzzerUtils.int2array(N, (int)-62);
        if (bFld) {
            vMeth(Test.instanceCount);
            iArr[(i >>> 1) % N][(i >>> 1) % N] = (int)Test.instanceCount;
        }
        i = i;
        for (i19 = 2; i19 < 125; ++i19) {
            Test.instanceCount = -131;
            f2 += (float)-2.101170;
        }
        iArr[(0 >>> 1) % N][(i >>> 1) % N] = (int)Test.instanceCount;
        for (i21 = 4; i21 < 187; ++i21) {
            Test.iArrFld[i21] = (int)Test.instanceCount;
            Test.instanceCount = i19;
        }
        iArr[(i >>> 1) % N][(i21 >>> 1) % N] *= i21;
        for (i23 = 7; i23 < 148; ++i23) {
            i20 = (int)Test.instanceCount;
            if (bFld) continue;
            for (i25 = 4; i25 < 178; ++i25) {
                Test.iArrFld[i25 - 1] *= (int)Test.instanceCount;
                lArr2[i23] >>>= 62;
                for (i27 = 1; i27 < 2; i27++) {
                    f2 = i21;
                    switch ((i23 % 3) + 62) {
                    case 62:
                        fArr[i23 - 1] = f2;
                        i24 = (int)Test.instanceCount;
                        lArr2[i23 - 1] = 191;
                        Test.sFld = (short)7;
                        break;
                    case 63:
                        bFld = bFld;
                        break;
                    case 64:
                        i20 = -41301;
                        break;
                    }
                    i24 = i28;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
